package com.dawn.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * 当使用 ConfigurableApplicationContext 接口中的 start() 方法启动 ApplicationContext 时，该事件被发布。
 * 你可以调查你的数据库，或者你可以在接受到这个事件后重启任何停止的应用程序。
 * Created by Dawn on 2020-04-09.
 */
public class StarEventHandler implements ApplicationListener<ContextStartedEvent> {
    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        System.out.println("ContextStartEvent received");
    }
}
