package com.dawn.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 基于构造函数依赖注入
 * Created by Dawn on 2020-04-06.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
        /*  Inside SpellChecker constructor
            Inside TextEditor constructor
            checkSpelling
        */
        System.out.println("----------------值函数依赖注入----------------");
        ValueMethod valueMethod = (ValueMethod) context.getBean("valueMethod");
        valueMethod.spellChecker();
    }
}
