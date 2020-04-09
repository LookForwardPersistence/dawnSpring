package com.dawn.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dawn on 2020-04-09.
 */
public class JSR250App {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBeans.xml");
        JSR250Dawn jsr250Dawn = (JSR250Dawn) context.getBean("jsr250Dawn");
        jsr250Dawn.getMessage();
        context.registerShutdownHook();
    }
}
