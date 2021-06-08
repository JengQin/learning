package com.jeng.tool.cronutils;

import com.cronutils.model.Cron;
import com.cronutils.model.CronType;
import com.cronutils.model.definition.CronDefinition;
import com.cronutils.model.definition.CronDefinitionBuilder;
import com.cronutils.model.time.ExecutionTime;
import com.cronutils.parser.CronParser;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

public class ParseCronExpr {

    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {

        String cronExprString = "0 0 15 21 5 ? 2021";
        LocalDateTime dateTime = LocalDateTime.parse("2021-05-20 15:00:00", dateTimeFormatter);
//        dateTime = dateTime.plusSeconds(1);
        ZonedDateTime zonedDateTime = ZonedDateTime.ofLocal(dateTime, ZoneId.of("UTC+8"), ZoneOffset.of("+8"));

        System.out.println(zonedDateTime);

        CronDefinition cronDefinition = CronDefinitionBuilder.instanceDefinitionFor(CronType.QUARTZ);
        CronParser cronParser = new CronParser(cronDefinition);
        Cron cron = cronParser.parse(cronExprString);

        ExecutionTime executionTime = ExecutionTime.forCron(cron);

        Optional<ZonedDateTime> lastTime = executionTime.lastExecution(zonedDateTime);
        Optional<ZonedDateTime> nextTime = executionTime.nextExecution(zonedDateTime);

        System.out.println(lastTime.get());
        System.out.println(nextTime.get());


        Optional<Duration> timeToNextExecution = executionTime.timeToNextExecution(zonedDateTime);
        Optional<Duration> timeFromLastExecution = executionTime.timeFromLastExecution(zonedDateTime);

        System.out.println(timeFromLastExecution.get().get(ChronoUnit.SECONDS));
        System.out.println(timeToNextExecution.get().get(ChronoUnit.SECONDS));

    }
}
