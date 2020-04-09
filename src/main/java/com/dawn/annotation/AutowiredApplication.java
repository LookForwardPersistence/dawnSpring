package com.dawn.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Autowired注解
 * 你可以在 XML 文件中的 setter 方法中使用 @Autowired 注释来除去 元素。
 * 当 Spring遇到一个在 setter 方法中使用的 @Autowired 注释，它会在方法中视图执行 byType 自动连接。
 * Created by Dawn on 2020-04-09.
 */
public class AutowiredApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBeans.xml");
        AutowiredDawn autowiredDawn = (AutowiredDawn) context.getBean("autowiredDawn");
        autowiredDawn.spellChecking();

    }
}
