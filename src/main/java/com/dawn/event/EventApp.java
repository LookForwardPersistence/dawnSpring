package com.dawn.event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dawn on 2020-04-09.
 */
public class EventApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("EventBeans.xml");
        context.start();
        EventMessage message = (EventMessage) context.getBean("eventMessage");
        message.getMessage();
        context.stop();
    }
}
