package com.dawn.event;

/**
 * Created by Dawn on 2020-04-09.
 */
public class EventMessage {
    private String message;

    public String getMessage() {
        System.out.println("Message:"+message);
        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }
}
