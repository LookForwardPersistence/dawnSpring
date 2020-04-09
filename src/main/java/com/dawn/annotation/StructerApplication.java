package com.dawn.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dawn on 2020-04-09.
 */
public class StructerApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBeans.xml");
        StructerDawn structerDawn = (StructerDawn) context.getBean("structerDawn");
        structerDawn.spellChecking();
    }
}
