package com.dawn.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by Dawn on 2020-04-09.
 */
public class CustomEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
            this.publisher=applicationEventPublisher;
    }

    //发布事件
    public void publish(){
        CustomEvent customEvent = new CustomEvent(this);
        publisher.publishEvent(customEvent);
    }
}
