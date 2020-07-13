/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

grammar SqlBase;

tokens {
    DELIMITER
}

singleStatement
    : statement EOF
    ;

standaloneExpression
    : expression EOF
    ;

standaloneRoutineBody
    : routineBody EOF
    ;

statement
    : query                                                            #statementDefault
    | USE schema=identifier                                            #use
    | USE catalog=identifier '.' schema=identifier                     #use
    | CREATE SCHEMA (IF NOT EXISTS)? qualifiedName
        (WITH properties)?                                             #createSchema
    | DROP SCHEMA (IF EXISTS)? qualifiedName (CASCADE | RESTRICT)?     #dropSchema
    | ALTER SCHEMA qualifiedName RENAME TO identifier                  #renameSchema
    | CREATE TABLE (IF NOT EXISTS)? qualifiedName columnAliases?
        (COMMENT string)?
        (WITH properties)? AS (query | '('query')')
        (WITH (NO)? DATA)?                                             #createTableAsSelect
    | CREATE TABLE (IF NOT EXISTS)? qualifiedName
        '(' tableElement (',' tableElement)* ')'
         (COMMENT string)?
         (WITH properties)?                                            #createTable
    | DROP TABLE (IF EXISTS)? qualifiedName                            #dropTable
//    | INSERT INTO qualifiedName columnAliases? query                   #insertInto
    | INSERT INTO targetTable columnAliases? query                      #insertInto  //使用targetTable代替qualifiedName
//    | DELETE FROM qualifiedName (WHERE booleanExpression)?             #delete
    | DELETE FROM targetTable (WHERE booleanExpression)?                #delete     //使用targetTable代替qualifiedName
//    | ALTER TABLE from=qualifiedName RENAME TO to=qualifiedName        #renameTable
    | ALTER TABLE from=targetTable RENAME TO to=targetTable             #renameTable    //使用targetTable代替qualifiedName
    | ALTER TABLE tableName=qualifiedName
        RENAME COLUMN from=identifier TO to=identifier                 #renameColumn
    | ALTER TABLE tableName=qualifiedName
        DROP COLUMN column=qualifiedName                               #dropColumn
    | ALTER TABLE tableName=qualifiedName
        ADD COLUMN column=columnDefinition                             #addColumn
    | ANALYZE qualifiedName (WITH properties)?                         #analyze
    | CREATE (OR REPLACE)? VIEW qualifiedName AS query                 #createView
    | DROP VIEW (IF EXISTS)? qualifiedName                             #dropView
    | CREATE (OR REPLACE)? FUNCTION functionName=qualifiedName
        '(' (sqlParameterDeclaration (',' sqlParameterDeclaration)*)? ')'
        RETURNS returnType=type
        (COMMENT string)?
        routineCharacteristics routineBody                             #createFunction
    | ALTER FUNCTION qualifiedName types?
      alterRoutineCharacteristics                                      #alterFunction
    | DROP FUNCTION (IF EXISTS)? qualifiedName types?                  #dropFunction
    | CALL qualifiedName '(' (callArgument (',' callArgument)*)? ')'   #call
    | CREATE ROLE name=identifier
        (WITH ADMIN grantor)?                                          #createRole
    | DROP ROLE name=identifier                                        #dropRole
    | GRANT
        roles
        TO principal (',' principal)*
        (WITH ADMIN OPTION)?
        (GRANTED BY grantor)?                                          #grantRoles
    | REVOKE
        (ADMIN OPTION FOR)?
        roles
        FROM principal (',' principal)*
        (GRANTED BY grantor)?                                          #revokeRoles
    | SET ROLE (ALL | NONE | role=identifier)                          #setRole
    | GRANT
        (privilege (',' privilege)* | ALL PRIVILEGES)
        ON TABLE? qualifiedName TO grantee=principal
        (WITH GRANT OPTION)?                                           #grant
    | REVOKE
        (GRANT OPTION FOR)?
        (privilege (',' privilege)* | ALL PRIVILEGES)
        ON TABLE? qualifiedName FROM grantee=principal                #revoke
    | SHOW GRANTS
        (ON TABLE? qualifiedName)?                                     #showGrants
    | EXPLAIN ANALYZE? VERBOSE?
        ('(' explainOption (',' explainOption)* ')')? statement        #explain
    | SHOW CREATE TABLE qualifiedName                                  #showCreateTable
    | SHOW CREATE VIEW qualifiedName                                   #showCreateView
    | SHOW CREATE FUNCTION qualifiedName types?                        #showCreateFunction
    | SHOW TABLES ((FROM | IN) qualifiedName)?
        (LIKE pattern=string (ESCAPE escape=string)?)?                 #showTables
    | SHOW SCHEMAS ((FROM | IN) identifier)?
        (LIKE pattern=string (ESCAPE escape=string)?)?                 #showSchemas
    | SHOW CATALOGS (LIKE pattern=string)?                             #showCatalogs
    | SHOW COLUMNS (FROM | IN) qualifiedName                           #showColumns
    | SHOW STATS FOR qualifiedName                                     #showStats
    | SHOW STATS FOR '(' querySpecification ')'                        #showStatsForQuery
    | SHOW CURRENT? ROLES ((FROM | IN) identifier)?                    #showRoles
    | SHOW ROLE GRANTS ((FROM | IN) identifier)?                       #showRoleGrants
    | DESCRIBE qualifiedName                                           #showColumns
    | DESC qualifiedName                                               #showColumns
    | SHOW FUNCTIONS
        (LIKE pattern=string (ESCAPE escape=string)?)?                 #showFunctions
    | SHOW SESSION                                                     #showSession
    | SET SESSION qualifiedName EQ expression                          #setSession
    | RESET SESSION qualifiedName                                      #resetSession
    | START TRANSACTION (transactionMode (',' transactionMode)*)?      #startTransaction
    | COMMIT WORK?                                                     #commit
    | ROLLBACK WORK?                                                   #rollback
    | PREPARE identifier FROM statement                                #prepare
    | DEALLOCATE PREPARE identifier                                    #deallocate
    | EXECUTE identifier (USING expression (',' expression)*)?         #execute
    | DESCRIBE INPUT identifier                                        #describeInput
    | DESCRIBE OUTPUT identifier                                       #describeOutput
    ;

query
    :  with? queryNoWith
    ;

with
    : WITH RECURSIVE? namedQuery (',' namedQuery)*
    ;

tableElement
    : columnDefinition
    | likeClause
    ;

columnDefinition
    : identifier type (NOT NULL)? (COMMENT string)? (WITH properties)?
    ;

likeClause
    : LIKE qualifiedName (optionType=(INCLUDING | EXCLUDING) PROPERTIES)?
    ;

properties
    : '(' property (',' property)* ')'
    ;

property
    : identifier EQ expression
    ;

sqlParameterDeclaration
    : identifier type
    ;

routineCharacteristics
    : routineCharacteristic*
    ;

routineCharacteristic
    : LANGUAGE language
    | determinism
    | nullCallClause
    ;

alterRoutineCharacteristics
    : alterRoutineCharacteristic*
    ;

alterRoutineCharacteristic
    : nullCallClause
    ;

routineBody
    : returnStatement
    | externalBodyReference
    ;

returnStatement
    : RETURN expression
    ;

externalBodyReference
    : EXTERNAL (NAME externalRoutineName)?
    ;

language
    : SQL
    | identifier
    ;

determinism
    : DETERMINISTIC
    | NOT DETERMINISTIC;

nullCallClause
    : RETURNS NULL ON NULL INPUT
    | CALLED ON NULL INPUT
    ;

externalRoutineName
    : identifier
    ;

queryNoWith:
      queryTerm
      (ORDER BY sortItem (',' sortItem)*)?
      (LIMIT limit=(INTEGER_VALUE | ALL))?
    ;

queryTerm
    : queryPrimary                                                             #queryTermDefault
//    | left=queryTerm operator=INTERSECT setQuantifier? right=queryTerm         #setOperation    //INTERSECT取交集，union取并集，EXCEPT取差集
//    | left=queryTerm operator=(UNION | EXCEPT) setQuantifier? right=queryTerm  #setOperation
    | queryPrimary
       (UNION | EXCEPT | INTERSECT) setQuantifier? queryPrimary
       ( (UNION | EXCEPT | INTERSECT) setQuantifier? queryPrimary )*  #setOperation //INTERSECT取交集，union取并集，EXCEPT取差集
    ;

queryPrimary
    : querySpecification                   #queryPrimaryDefault
    | TABLE qualifiedName                  #table
    | VALUES expression (',' expression)*  #inlineTable
    | '(' queryNoWith  ')'                 #subquery
    ;

sortItem
    : expression ordering=(ASC | DESC)? (NULLS nullOrdering=(FIRST | LAST))?
    ;

//  每一个select表示开始一个新的临时表
querySpecification
    : SELECT setQuantifier? selectItem (',' selectItem)*
      (FROM relation (',' relation)*)?
//      (WHERE where=booleanExpression)?
      (whereClause)?
      (GROUP BY groupBy)?
      (HAVING having=booleanExpression)?
    ;

whereClause:
    WHERE where=booleanExpression
    ;

groupBy
    : setQuantifier? groupingElement (',' groupingElement)*
    ;

groupingElement
    : groupingSet                                            #singleGroupingSet
    | ROLLUP '(' (expression (',' expression)*)? ')'         #rollup
    | CUBE '(' (expression (',' expression)*)? ')'           #cube
    | GROUPING SETS '(' groupingSet (',' groupingSet)* ')'   #multipleGroupingSets
    ;

groupingSet
    : '(' (expression (',' expression)*)? ')'
    | expression
    ;

namedQuery
//    : name=identifier (columnAliases)? AS '(' query ')'
    : '(' query ')' AS name=identifier (columnAliases)?
    ;

setQuantifier
    : DISTINCT
    | ALL
    ;

selectItem
    : expression (AS? identifier)?  #selectSingle
//    : selectExpression (AS? identifier)?  #selectSingle
    | qualifiedName '.' ASTERISK    #selectAll
    | ASTERISK                      #selectAll
    ;

relation
    : left=relation
      (
      CROSS JOIN right=sampledRelation                              // 笛卡尔积，不带on条件
      | joinType JOIN rightRelation=relation joinCriteria           // 带on条件的join
      | NATURAL joinType JOIN right=sampledRelation                 // 自然连接，默认是按照相同名称相同类型的列进行join，所以也不带on条件
      )                                           #joinRelation
    | sampledRelation                             #relationDefault
    ;

joinType
//    : INNER?
//    | LEFT OUTER?
//    | RIGHT OUTER?
//    | FULL OUTER?
    : GLOBAL?
        (
        INNER?
        | LEFT ( OUTER | SEMI | ANTI )?
        | RIGHT ( OUTER | SEMI | ANTI )?
        | FULL ( OUTER | SEMI | ANTI )?
        | CROSS?
        )
    ;

joinCriteria
    : ON booleanExpression
    | USING '(' identifier (',' identifier)* ')'
    ;

sampledRelation
    : aliasedRelation (
        TABLESAMPLE sampleType '(' percentage=expression ')'    //TABLESAMPLE 抽样，
      )?
    ;

sampleType
    : BERNOULLI
    | SYSTEM
    ;

aliasedRelation
    : relationPrimary (AS? identifier columnAliases?)?      # aliasedRelationDefault
    | sourceTable (AS? identifier)?                         # tableName // from的最终子句：源表
    ;

columnAliases
    : '(' identifier (',' identifier)* ')'
    ;

relationPrimary                 // from的最终子句
//    : sourceTable                                                   #tableName
    : '(' query ')'                                                   #subqueryRelation
    | UNNEST '(' expression (',' expression)* ')' (WITH ORDINALITY)?  #unnest
    | LATERAL '(' query ')'                                           #lateral
    | '(' relation ')'                                                #parenthesizedRelation
    ;
//----------
// 来源表
sourceTable
    : (databaseName '.')? sourceTableName
    ;
databaseName:       // DB名称
    identifier
    ;
sourceTableName:    //table名称
    identifier
    ;

// 目标表
targetTable:
    (databaseName '.')? targetTableName
    ;
targetTableName:    //table名称
    identifier
    ;
//============

expression
    : booleanExpression
    ;

booleanExpression
    : valueExpression predicate[$valueExpression.ctx]?             #predicated
    | NOT booleanExpression                                        #logicalNot
    | left=booleanExpression operator=AND right=booleanExpression  #logicalBinary
    | left=booleanExpression operator=OR right=booleanExpression   #logicalBinary
    ;

// workaround for https://github.com/antlr/antlr4/issues/780
predicate[ParserRuleContext value]
    : comparisonOperator right=valueExpression                            #comparison
    | comparisonOperator comparisonQuantifier '(' query ')'               #quantifiedComparison
    | NOT? BETWEEN lower=valueExpression AND upper=valueExpression        #between
    | NOT? IN '(' expression (',' expression)* ')'                        #inList
//    | NOT? IN '(' query ')'                                               #inSubquery
    | GLOBAL? NOT? IN '(' query ')'                                       #inSubquery
    | NOT? LIKE pattern=valueExpression (ESCAPE escape=valueExpression)?  #like
    | IS NOT? NULL                                                        #nullPredicate
    | IS NOT? DISTINCT FROM right=valueExpression                         #distinctFrom
    ;

valueExpression
    : primaryExpression                                                                 #valueExpressionDefault
    | valueExpression AT timeZoneSpecifier                                              #atTimeZone
    | operator=(MINUS | PLUS) valueExpression                                           #arithmeticUnary
    | left=valueExpression operator=(ASTERISK | SLASH | PERCENT) right=valueExpression  #arithmeticBinary
    | left=valueExpression operator=(PLUS | MINUS) right=valueExpression                #arithmeticBinary
    | left=valueExpression CONCAT right=valueExpression                                 #concatenation
    ;

primaryExpression
    : NULL                                                                                #nullLiteral
    | interval                                                                            #intervalLiteral
    | identifier string                                                                   #typeConstructor
    | DOUBLE_PRECISION string                                                             #typeConstructor
    | number                                                                              #numericLiteral
    | booleanValue                                                                        #booleanLiteral
    | string                                                                              #stringLiteral
    | BINARY_LITERAL                                                                      #binaryLiteral
    | '?'                                                                                 #parameter
    | POSITION '(' valueExpression IN valueExpression ')'                                 #position
    | '(' expression (',' expression)+ ')'                                                #rowConstructor
    | ROW '(' expression (',' expression)* ')'                                            #rowConstructor
    | qualifiedName '(' ASTERISK ')' filter? over?                                        #functionCall
    | qualifiedName '(' (setQuantifier? expression (',' expression)*)?
        (ORDER BY sortItem (',' sortItem)*)? ')' filter? (nullTreatment? over)?           #functionCall
    | identifier '->' expression                                                          #lambda
    | '(' (identifier (',' identifier)*)? ')' '->' expression                             #lambda
    | '(' query ')'                                                                       #subqueryExpression
    // This is an extension to ANSI SQL, which considers EXISTS to be a <boolean expression>
    | EXISTS '(' query ')'                                                                #exists
    | CASE valueExpression whenClause+ (ELSE elseExpression=expression)? END              #simpleCase
    | CASE whenClause+ (ELSE elseExpression=expression)? END                              #searchedCase
    | CAST '(' expression AS type ')'                                                     #cast
    | TRY_CAST '(' expression AS type ')'                                                 #cast
    | ARRAY '[' (expression (',' expression)*)? ']'                                       #arrayConstructor
    | value=primaryExpression '[' index=valueExpression ']'                               #subscript
    | identifier                                                                          #columnReference
    | base=primaryExpression '.' fieldName=identifier                                     #dereference
    | name=CURRENT_DATE                                                                   #specialDateTimeFunction
    | name=CURRENT_TIME ('(' precision=INTEGER_VALUE ')')?                                #specialDateTimeFunction
    | name=CURRENT_TIMESTAMP ('(' precision=INTEGER_VALUE ')')?                           #specialDateTimeFunction
    | name=LOCALTIME ('(' precision=INTEGER_VALUE ')')?                                   #specialDateTimeFunction
    | name=LOCALTIMESTAMP ('(' precision=INTEGER_VALUE ')')?                              #specialDateTimeFunction
    | name=CURRENT_USER                                                                   #currentUser
    | SUBSTRING '(' valueExpression FROM valueExpression (FOR valueExpression)? ')'       #substring
    | NORMALIZE '(' valueExpression (',' normalForm)? ')'                                 #normalize
    | EXTRACT '(' identifier FROM valueExpression ')'                                     #extract
    | '(' expression ')'                                                                  #parenthesizedExpression
    | GROUPING '(' (qualifiedName (',' qualifiedName)*)? ')'                              #groupingOperation
    ;

string
    : STRING                                #basicStringLiteral
    | UNICODE_STRING (UESCAPE STRING)?      #unicodeStringLiteral
    ;

nullTreatment
    : IGNORE NULLS
    | RESPECT NULLS
    ;

timeZoneSpecifier
    : TIME ZONE interval  #timeZoneInterval
    | TIME ZONE string    #timeZoneString
    ;

comparisonOperator
    : EQ | NEQ | LT | LTE | GT | GTE
    ;

comparisonQuantifier
    : ALL | SOME | ANY
    ;

booleanValue
    : TRUE | FALSE
    ;

interval
    : INTERVAL sign=(PLUS | MINUS)? string from=intervalField (TO to=intervalField)?
    ;

intervalField
    : YEAR | MONTH | DAY | HOUR | MINUTE | SECOND
    ;

normalForm
    : NFD | NFC | NFKD | NFKC
    ;

types
    : '(' (type (',' type)*)? ')'
    ;

type
    : type ARRAY
    | ARRAY '<' type '>'
    | MAP '<' type ',' type '>'
    | ROW '(' identifier type (',' identifier type)* ')'
    | baseType ('(' typeParameter (',' typeParameter)* ')')?
    | INTERVAL from=intervalField TO to=intervalField
    ;

typeParameter
    : INTEGER_VALUE | type
    ;

baseType
    : TIME_WITH_TIME_ZONE
    | TIMESTAMP_WITH_TIME_ZONE
    | DOUBLE_PRECISION
    | identifier
    ;

whenClause
    : WHEN condition=expression THEN result=expression
    ;

filter
    : FILTER '(' WHERE booleanExpression ')'
    ;

over
    : OVER '('
        (PARTITION BY partition+=expression (',' partition+=expression)*)?
        (ORDER BY sortItem (',' sortItem)*)?
        windowFrame?
      ')'
    ;

windowFrame
    : frameType=RANGE start=frameBound
    | frameType=ROWS start=frameBound
    | frameType=RANGE BETWEEN start=frameBound AND end=frameBound
    | frameType=ROWS BETWEEN start=frameBound AND end=frameBound
    ;

frameBound
    : UNBOUNDED boundType=PRECEDING                 #unboundedFrame
    | UNBOUNDED boundType=FOLLOWING                 #unboundedFrame
    | CURRENT ROW                                   #currentRowBound
    | expression boundType=(PRECEDING | FOLLOWING)  #boundedFrame // expression should be unsignedLiteral
    ;


explainOption
    : FORMAT value=(TEXT | GRAPHVIZ | JSON)                 #explainFormat
    | TYPE value=(LOGICAL | DISTRIBUTED | VALIDATE | IO)    #explainType
    ;

transactionMode
    : ISOLATION LEVEL levelOfIsolation    #isolationLevel
    | READ accessMode=(ONLY | WRITE)      #transactionAccessMode
    ;

levelOfIsolation
    : READ UNCOMMITTED                    #readUncommitted
    | READ COMMITTED                      #readCommitted
    | REPEATABLE READ                     #repeatableRead
    | SERIALIZABLE                        #serializable
    ;

callArgument
    : expression                    #positionalArgument
    | identifier '=>' expression    #namedArgument
    ;

privilege
    : SELECT | DELETE | INSERT | identifier
    ;

qualifiedName
    : identifier ('.' identifier)*
    ;

grantor
    : CURRENT_USER          #currentUserGrantor
    | CURRENT_ROLE          #currentRoleGrantor
    | principal             #specifiedPrincipal
    ;

principal
    : USER identifier       #userPrincipal
    | ROLE identifier       #rolePrincipal
    | identifier            #unspecifiedPrincipal
    ;

roles
    : identifier (',' identifier)*
    ;

identifier
    : IDENTIFIER             #unquotedIdentifier
    | QUOTED_IDENTIFIER      #quotedIdentifier
    | nonReserved            #unquotedIdentifier
    | BACKQUOTED_IDENTIFIER  #backQuotedIdentifier
    | DIGIT_IDENTIFIER       #digitIdentifier
    ;

number
    : DECIMAL_VALUE  #decimalLiteral
    | DOUBLE_VALUE   #doubleLiteral
    | INTEGER_VALUE  #integerLiteral
    ;

nonReserved
    // IMPORTANT: this rule must only contain tokens. Nested rules are not supported. See SqlParser.exitNonReserved
    : ADD | ADMIN | ALL | ANALYZE | ANY | ARRAY | ASC | AT
    | BERNOULLI
    | CALL | CALLED | CASCADE | CATALOGS | COLUMN | COLUMNS | COMMENT | COMMIT | COMMITTED | CURRENT | CURRENT_ROLE
    | DATA | DATE | DAY | DESC | DETERMINISTIC | DISTRIBUTED
    | EXCLUDING | EXPLAIN | EXTERNAL
    | FILTER | FIRST | FOLLOWING | FORMAT | FUNCTION | FUNCTIONS
    | GRANT | GRANTED | GRANTS | GRAPHVIZ
    | HOUR
    | IF | IGNORE | INCLUDING | INPUT | INTERVAL | IO | ISOLATION
    | JSON
    | LANGUAGE | LAST | LATERAL | LEVEL | LIMIT | LOGICAL
    | MAP | MINUTE | MONTH
    | NAME | NFC | NFD | NFKC | NFKD | NO | NONE | NULLIF | NULLS
    | ONLY | OPTION | ORDINALITY | OUTPUT | OVER
    | PARTITION | PARTITIONS | POSITION | PRECEDING | PRIVILEGES | PROPERTIES
    | RANGE | READ | RENAME | REPEATABLE | REPLACE | RESET | RESPECT | RESTRICT | RETURN | RETURNS | REVOKE | ROLE | ROLES | ROLLBACK | ROW | ROWS
    | SCHEMA | SCHEMAS | SECOND | SERIALIZABLE | SESSION | SET | SETS | SQL
    | SHOW | SOME | START | STATS | SUBSTRING | SYSTEM
    | TABLES | TABLESAMPLE | TEXT | TIME | TIMESTAMP | TO | TRANSACTION | TRY_CAST | TYPE
    | UNBOUNDED | UNCOMMITTED | USE | USER
    | VALIDATE | VERBOSE | VIEW
    | WORK | WRITE
    | YEAR
    | ZONE
    ;

GLOBAL: G L O B A L; // global
SEMI: S E M I; // semi
ANTI: A N T I; // anti

ADD:	A D D ;
ADMIN:	A D M I N ;
ALL:	A L L ;
ALTER:	A L T E R ;
ANALYZE:	A N A L Y Z E ;
AND:	A N D ;
ANY:	A N Y ;
ARRAY:	A R R A Y ;
AS:	A S ;
ASC:	A S C ;
AT:	A T ;
BERNOULLI:	B E R N O U L L I ;
BETWEEN:	B E T W E E N ;
BY:	B Y ;
CALL:	C A L L ;
CALLED:	C A L L E D ;
CASCADE:	C A S C A D E ;
CASE:	C A S E ;
CAST:	C A S T ;
CATALOGS:	C A T A L O G S ;
COLUMN:	C O L U M N ;
COLUMNS:	C O L U M N S ;
COMMENT:	C O M M E N T ;
COMMIT:	C O M M I T ;
COMMITTED:	C O M M I T T E D ;
CONSTRAINT:	C O N S T R A I N T ;
CREATE:	C R E A T E ;
CROSS:	C R O S S ;
CUBE:	C U B E ;
CURRENT:	C U R R E N T ;
CURRENT_DATE:	C U R R E N T UNDERLINE D A T E ;
CURRENT_ROLE:	C U R R E N T UNDERLINE R O L E ;
CURRENT_TIME:	C U R R E N T UNDERLINE T I M E ;
CURRENT_TIMESTAMP:	C U R R E N T UNDERLINE T I M E S T A M P ;
CURRENT_USER:	C U R R E N T UNDERLINE U S E R ;
DATA:	D A T A ;
DATE:	D A T E ;
DAY:	D A Y ;
DEALLOCATE:	D E A L L O C A T E ;
DELETE:	D E L E T E ;
DESC:	D E S C ;
DESCRIBE:	D E S C R I B E ;
DETERMINISTIC:	D E T E R M I N I S T I C ;
DISTINCT:	D I S T I N C T ;
DISTRIBUTED:	D I S T R I B U T E D ;
DROP:	D R O P ;
ELSE:	E L S E ;
END:	E N D ;
ESCAPE:	E S C A P E ;
EXCEPT:	E X C E P T ;
EXCLUDING:	E X C L U D I N G ;
EXECUTE:	E X E C U T E ;
EXISTS:	E X I S T S ;
EXPLAIN:	E X P L A I N ;
EXTRACT:	E X T R A C T ;
EXTERNAL:	E X T E R N A L ;
FALSE:	F A L S E ;
FILTER:	F I L T E R ;
FIRST:	F I R S T ;
FOLLOWING:	F O L L O W I N G ;
FOR:	F O R ;
FORMAT:	F O R M A T ;
FROM:	F R O M ;
FULL:	F U L L ;
FUNCTION:	F U N C T I O N ;
FUNCTIONS:	F U N C T I O N S ;
GRANT:	G R A N T ;
GRANTED:	G R A N T E D ;
GRANTS:	G R A N T S ;
GRAPHVIZ:	G R A P H V I Z ;
GROUP:	G R O U P ;
GROUPING:	G R O U P I N G ;
HAVING:	H A V I N G ;
HOUR:	H O U R ;
IF:	I F ;
IGNORE:	I G N O R E ;
IN:	I N ;
INCLUDING:	I N C L U D I N G ;
INNER:	I N N E R ;
INPUT:	I N P U T ;
INSERT:	I N S E R T ;
INTERSECT:	I N T E R S E C T ;
INTERVAL:	I N T E R V A L ;
INTO:	I N T O ;
IO:	I O ;
IS:	I S ;
ISOLATION:	I S O L A T I O N ;
JSON:	J S O N ;
JOIN:	J O I N ;
LANGUAGE:	L A N G U A G E ;
LAST:	L A S T ;
LATERAL:	L A T E R A L ;
LEFT:	L E F T ;
LEVEL:	L E V E L ;
LIKE:	L I K E ;
LIMIT:	L I M I T ;
LOCALTIME:	L O C A L T I M E ;
LOCALTIMESTAMP:	L O C A L T I M E S T A M P ;
LOGICAL:	L O G I C A L ;
MAP:	M A P ;
MINUTE:	M I N U T E ;
MONTH:	M O N T H ;
NAME:	N A M E ;
NATURAL:	N A T U R A L ;
NFC :	N F C ;
NFD :	N F D ;
NFKC :	N F K C ;
NFKD :	N F K D ;
NO:	N O ;
NONE:	N O N E ;
NORMALIZE:	N O R M A L I Z E ;
NOT:	N O T ;
NULL:	N U L L ;
NULLIF:	N U L L I F ;
NULLS:	N U L L S ;
ON:	O N ;
ONLY:	O N L Y ;
OPTION:	O P T I O N ;
OR:	O R ;
ORDER:	O R D E R ;
ORDINALITY:	O R D I N A L I T Y ;
OUTER:	O U T E R ;
OUTPUT:	O U T P U T ;
OVER:	O V E R ;
PARTITION:	P A R T I T I O N ;
PARTITIONS:	P A R T I T I O N S ;
POSITION:	P O S I T I O N ;
PRECEDING:	P R E C E D I N G ;
PREPARE:	P R E P A R E ;
PRIVILEGES:	P R I V I L E G E S ;
PROPERTIES:	P R O P E R T I E S ;
RANGE:	R A N G E ;
READ:	R E A D ;
RECURSIVE:	R E C U R S I V E ;
RENAME:	R E N A M E ;
REPEATABLE:	R E P E A T A B L E ;
REPLACE:	R E P L A C E ;
RESET:	R E S E T ;
RESPECT:	R E S P E C T ;
RESTRICT:	R E S T R I C T ;
RETURN:	R E T U R N ;
RETURNS:	R E T U R N S ;
REVOKE:	R E V O K E ;
RIGHT:	R I G H T ;
ROLE:	R O L E ;
ROLES:	R O L E S ;
ROLLBACK:	R O L L B A C K ;
ROLLUP:	R O L L U P ;
ROW:	R O W ;
ROWS:	R O W S ;
SCHEMA:	S C H E M A ;
SCHEMAS:	S C H E M A S ;
SECOND:	S E C O N D ;
SELECT:	S E L E C T ;
SERIALIZABLE:	S E R I A L I Z A B L E ;
SESSION:	S E S S I O N ;
SET:	S E T ;
SETS:	S E T S ;
SHOW:	S H O W ;
SOME:	S O M E ;
SQL:	S Q L ;
START:	S T A R T ;
STATS:	S T A T S ;
SUBSTRING:	S U B S T R I N G ;
SYSTEM:	S Y S T E M ;
TABLE:	T A B L E ;
TABLES:	T A B L E S ;
TABLESAMPLE:	T A B L E S A M P L E ;
TEXT:	T E X T ;
THEN:	T H E N ;
TIME:	T I M E ;
TIMESTAMP:	T I M E S T A M P ;
TO:	T O ;
TRANSACTION:	T R A N S A C T I O N ;
TRUE:	T R U E ;
TRY_CAST:	T R Y UNDERLINE C A S T ;
TYPE:	T Y P E ;
UESCAPE:	U E S C A P E ;
UNBOUNDED:	U N B O U N D E D ;
UNCOMMITTED:	U N C O M M I T T E D ;
UNION:	U N I O N ;
UNNEST:	U N N E S T ;
USE:	U S E ;
USER:	U S E R ;
USING:	U S I N G ;
VALIDATE:	V A L I D A T E ;
VALUES:	V A L U E S ;
VERBOSE:	V E R B O S E ;
VIEW:	V I E W ;
WHEN:	W H E N ;
WHERE:	W H E R E ;
WITH:	W I T H ;
WORK:	W O R K ;
WRITE:	W R I T E ;
YEAR:	Y E A R ;
ZONE:	Z O N E ;


EQ  : '=';
NEQ : '<>' | '!=';
LT  : '<';
LTE : '<=';
GT  : '>';
GTE : '>=';

PLUS: '+';
MINUS: '-';
ASTERISK: '*';
SLASH: '/';
PERCENT: '%';
CONCAT: '||';

STRING
    : '\'' ( ~'\'' | '\'\'' )* '\''
    ;

UNICODE_STRING
    : 'U&\'' ( ~'\'' | '\'\'' )* '\''
    ;

// Note: we allow any character inside the binary literal and validate
// its a correct literal when the AST is being constructed. This
// allows us to provide more meaningful error messages to the user
BINARY_LITERAL
    :  'X\'' (~'\'')* '\''
    ;

INTEGER_VALUE
    : DIGIT+
    ;

DECIMAL_VALUE
    : DIGIT+ '.' DIGIT*
    | '.' DIGIT+
    ;

DOUBLE_VALUE
    : DIGIT+ ('.' DIGIT*)? EXPONENT
    | '.' DIGIT+ EXPONENT
    ;

IDENTIFIER
    : (LETTER | '_') (LETTER | DIGIT | '_' | '@' | ':')*
    ;

DIGIT_IDENTIFIER
    : DIGIT (LETTER | DIGIT | '_' | '@' | ':')+
    ;

QUOTED_IDENTIFIER
    : '"' ( ~'"' | '""' )* '"'
    ;

BACKQUOTED_IDENTIFIER
    : '`' ( ~'`' | '``' )* '`'
    ;

TIME_WITH_TIME_ZONE
    : 'TIME' WS 'WITH' WS 'TIME' WS 'ZONE'
    ;

TIMESTAMP_WITH_TIME_ZONE
    : 'TIMESTAMP' WS 'WITH' WS 'TIME' WS 'ZONE'
    ;

DOUBLE_PRECISION
    : 'DOUBLE' WS 'PRECISION'
    ;

fragment EXPONENT
    : 'E' [+-]? DIGIT+
    ;

fragment DIGIT
    : [0-9]
    ;

fragment LETTER
    : [A-Za-z]
    ;

fragment UNDERLINE:	 '_';

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

SIMPLE_COMMENT
    : '--' ~[\r\n]* '\r'? '\n'? -> channel(HIDDEN)
    ;

BRACKETED_COMMENT
    : '/*' .*? '*/' -> channel(HIDDEN)
    ;

WS
    : [ \r\n\t]+ -> channel(HIDDEN)
    ;

// Catch-all for anything we can't recognize.
// We use this to be able to ignore and recover all the text
// when splitting statements with DelimiterLexer
UNRECOGNIZED
    : .
    ;
