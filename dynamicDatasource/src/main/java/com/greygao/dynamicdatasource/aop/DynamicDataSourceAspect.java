package com.greygao.dynamicdatasource.aop;

import com.greygao.dynamicdatasource.datasource.DataSource;
import com.greygao.dynamicdatasource.datasource.DynamicDataSourceContextHolder;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @class name DynamicDataSourceAspect
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/9/12 21:12
 * @Version 1.0
 **/
@Aspect
@Order(1)
@Component
public class DynamicDataSourceAspect {

    @Pointcut("@annotation(com.greygao.dynamicdatasource.datasource.DataSource)")
    public void dataSourcePointcut(){

    }

    @Around("dataSourcePointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        DataSource annotation = method.getAnnotation(DataSource.class);
        if (annotation != null){
            DynamicDataSourceContextHolder.setDataSourceType(annotation.value());
        }
        try {
            return point.proceed();
        } finally {
            DynamicDataSourceContextHolder.clearDataSourceType();
        }
    }
}
