package com.jeng.oauth.config;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * The AopConfig
 *
 * @author JiaZheng
 * @create 2021-06-26 17:08
 */

@Component
@Aspect
@Slf4j
public class LogAopConfig {
//    private final String executeExpr = "execution(* com.quwan.modules.*.controller.*Controller.*(..))";
    private final String executeExpr = "execution(* com.jeng.oauth.controller.*Controller.*(..))";

    @Before(executeExpr)
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        ApiOperation annotation = method.getAnnotation(ApiOperation.class);
        if (annotation != null) {
            log.info(String.format("[%s]: 开始执行....", annotation.value()));
        }
    }

    @After(executeExpr)
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        ApiOperation annotation = method.getAnnotation(ApiOperation.class);
        if (annotation != null) {
            log.info(String.format("[%s]: 执行结束.", annotation.value()));
        }

    }
}
