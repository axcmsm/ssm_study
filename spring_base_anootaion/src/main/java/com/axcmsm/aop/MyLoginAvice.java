package com.axcmsm.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ClassName: com.axcmsm.aop.MyLoginAvice
 * 微信公众号：代码飞快
 * Description:
 *
 * @author 须贺
 * @version 2023/4/21
 */
@Component
@Aspect
public class MyLoginAvice {

    @Pointcut("execution(Boolean com.axcmsm.service.*Service.*(*,*))")
    public void LoginPt(){}

    @Around("MyLoginAvice.LoginPt()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
            if (args[i].getClass().equals(String.class)) {
                args[i]=args[i].toString().trim();
            }
        }
        Object proceed = joinPoint.proceed(args);
        return proceed;
    }
}
