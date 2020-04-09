package com.dawn.aop;

/**
 * Created by Dawn on 2020-04-09.
 */
public class Logging {

    public void beforeAdvice(){
        System.out.println("Going to setup the dawn profile");
    }

    public void afterAdvice(){
        System.out.println("Dawn profile has been setup.");
    }

    public void afterReturningAdvice(Object object){
        System.out.println("Returning:"+ object);
    }

    public void afterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception:" + ex.getMessage());
    }
}
