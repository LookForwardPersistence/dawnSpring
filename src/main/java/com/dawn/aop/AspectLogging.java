package com.dawn.aop;

import org.aspectj.lang.annotation.*;

/**
 * 基于AOP的Aspect实现
 * Created by Dawn on 2020-04-09.
 */
@Aspect
public class AspectLogging {

    @Pointcut("execution(* com.dawn..*.*(..))")
    private void all(){}

    @Before("all()")
    public void beforeAdvice(){
        System.out.println("Goging to setup Message");
    }

    @After("all()")
    public void afterAdvice(){
        System.out.println("Message profile has been setup");
    }

    @AfterReturning(pointcut = "all()",returning = "object")
    public void afterReturningAdvice(Object object){
        System.out.println("Returning:" +object);
    }

    @AfterThrowing(pointcut = "all()",throwing = "ex")
    public void afterThrowing(IllegalArgumentException ex){
        System.out.println("There has been an exception:"+ex.getMessage());
    }
}
