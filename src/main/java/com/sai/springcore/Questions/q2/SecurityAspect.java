package com.sai.springcore.Questions.q2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {
    @Before("execution(* com.sai.springcore.Questions.q2.PaymentService.processPayment(..))")
    public void beforePayment(){
        System.out.println("Authentication successful");
    }

    @After("execution(* com.sai.springcore.Questions.q2.PaymentService.validateCC(..))")
    public void afterPayment(){
        System.out.println("Validation Completed");
    }

    @Around("execution(* com.sai.springcore.Questions.q2.PaymentService.process(..))")
    public Object aroundProcess(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("Before Process");
        Object result=joinPoint.proceed();
        System.out.println("After Process");
        return result;
    }
}
