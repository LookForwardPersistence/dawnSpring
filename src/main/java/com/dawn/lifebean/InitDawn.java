package com.dawn.lifebean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Bean后置处理器
 * 允许在调用初始化方法前后对Bean的额外处理
 * Created by Dawn on 2020-04-05.
 */
public class InitDawn implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        System.out.println("BeforeInitialization:"+s);
        return bean;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("AfterInitialization:"+s);
        return o;
    }
}
