package com.dawn.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 自动装配
 * byName id必须为类的首字母小写
 * byType
 * Created by Dawn on 2020-04-07.
 */
public class AutoApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Others.xml");
        ValueMethod valueMethod= (ValueMethod) context.getBean("valueMethod");
        valueMethod.spellChecker();
    }
}
