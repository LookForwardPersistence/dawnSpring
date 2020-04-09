package com.dawn.event;

import org.springframework.context.ApplicationListener;

/**
 * 处理自定义事件
 * Created by Dawn on 2020-04-09.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {

    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println(customEvent.toString());
    }
}
