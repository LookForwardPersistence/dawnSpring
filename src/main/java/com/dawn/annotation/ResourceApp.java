package com.dawn.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Resource(name="") 添加到set方法
 * Created by Dawn on 2020-04-09.
 */
public class ResourceApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBeans.xml");
        ResourceDawn resourceDawn = (ResourceDawn) context.getBean("resourceDawn");
        resourceDawn.spellCheck();
    }
}
