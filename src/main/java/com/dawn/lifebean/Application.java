package com.dawn.lifebean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * IOC容器 Bean生命周期
 * Created by Dawn on 2020-04-05.
 */
public class Application {
    public static void main(String[] args) {
        //1、加载CLASSPATH下可用的bean文件，并初始化所有bean文件的对象到上下（BeanFactory的子接口）
        //扩展1、bean初始化继承InitializingBean，销毁继承DisposableBean
//        ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //2、通过上下文根据bean ID获取对象
        DawnMessage message = (DawnMessage) context.getBean("dawnMessage");
        message.getMsg();
        // AbstractApplicationContext 类中声明的关闭 hook 的 registerShutdownHook() 方法来销毁bean
        context.registerShutdownHook();
    }
}
