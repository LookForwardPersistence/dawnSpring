package com.dawn.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dawn on 2020-04-09.
 */
public class QualifterApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBeans.xml");
        QaulifterDawn qaulifterDawn = (QaulifterDawn) context.getBean("qualifterDawn");
        qaulifterDawn.printName();
        qaulifterDawn.printAddress();
    }
}
