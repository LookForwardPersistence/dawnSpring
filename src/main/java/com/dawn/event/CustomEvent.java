package com.dawn.event;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件
 * Created by Dawn on 2020-04-09.
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
        System.out.println("Inside customEvent Received");
    }

    public String toString(){
        return "My custom event";
    }
}
