package com.supremepole.a07springbootcopytohistory.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Aspect
@Component
public class HistoryCopyAspect {

    @Autowired
    private HistoryOperationService historyOperationService;

    @AfterReturning(pointcut = "execution(* com.supremepole.a07springbootcopytohistory.*.*(..))", returning = "result")
    public void copyToHistory(JoinPoint joinPoint, Object result) {
        Object entity = result;
        if (result instanceof Collection) {
            entity = ((Collection<?>) result).stream().findFirst().orElse(null);
        }

        if (entity != null) {
            historyOperationService.copyToHistory(entity);
        }
    }
}
