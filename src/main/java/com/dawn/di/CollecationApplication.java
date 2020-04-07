package com.dawn.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注入集合
 * Created by Dawn on 2020-04-07.
 */
public class CollecationApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        JavaCollection javaCollection = (JavaCollection) context.getBean("javaCollection");
        javaCollection.getAddressList();
        javaCollection.getAddressSet();
        javaCollection.getMapAddress();
        javaCollection.getAddressProp();
    }
}
