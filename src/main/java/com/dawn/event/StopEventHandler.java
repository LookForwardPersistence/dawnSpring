package com.dawn.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * 当使用 ConfigurableApplicationContext 接口中的 stop() 方法停止 ApplicationContext 时，
 * 发布这个事件。你可以在接受到这个事件后做必要的清理的工作。
 * Created by Dawn on 2020-04-09.
 */
public class StopEventHandler implements ApplicationListener<ContextStoppedEvent> {
    public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent) {
        System.out.println("ContextStoppedEvent received");
    }
}
