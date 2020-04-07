package com.dawn.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *构造函数自动装配
 * Created by Dawn on 2020-04-07.
 */
public class ContructApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorBeans.xml");
        TextEditor editor = (TextEditor) context.getBean("textEditor");
        editor.spellCheck();
    }
}
