package com.dawn.extendbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring Bean 定义继承
 * 1、子 bean 的定义继承父定义的配置数据。子定义可以根据需要重写一些值，或者添加其他值。
 Spring Bean 定义的继承与 Java 类的继承无关，但是继承的概念是一样的。
 你可以定义一个父 bean 的定义作为模板和其他子 bean 就可以从父 bean 中继承所需的配置。
 当你使用基于 XML 的配置元数据时，通过使用父属性，指定父 bean 作为该属性的值来表明子 bean 的定义
 2、Bean定义模板 抽象属性，不能被实例
 * Created by Dawn on 2020-04-05.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        MessageOne messageOne = (MessageOne) context.getBean("messageOne");
        messageOne.getName();
        messageOne.getAddr();
        MessageTwo messageTwo = (MessageTwo) context.getBean("messageTwo");
        messageTwo.getName();
        messageTwo.getAddr();
        messageTwo.getJob();
        /*
        * MessageOne:Dawn
        MessageOne:PINGNAN
        MessageTwo:Star
        MessageTwo:PINGNAN //继承了messageOne
        MessageTwo:Engineer
        * */

        //bean定义模板
        /*
        *   MessageOne:Dawn
            MessageOne:PINGNAN
            MessageTwo:Star
            MessageTwo:GUANGXI
            MessageTwo:Engineer
            */
    }
}
