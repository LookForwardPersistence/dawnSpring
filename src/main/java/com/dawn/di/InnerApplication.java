package com.dawn.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *Spring 注入内部Beans
 * Created by Dawn on 2020-04-07.
 */
public class InnerApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Others.xml");
        ValueMethod valueMethod = (ValueMethod) context.getBean("valueMethod");
        valueMethod.spellChecker();
    }
}
