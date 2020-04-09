package com.dawn.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dawn on 2020-04-09.
 */
public class AspectApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AspectBeans.xml");
        Message message = (Message) context.getBean("message");
        message.getAge();
        message.getAddress();
        message.printThrowException();
    }
}
