package com.dawn.lifebean;

import java.io.Serializable;

/**
 * Created by Dawn on 2020-04-05.
 */
public class DawnMessage implements Serializable{

    private static final long serialVersionUID = 5722404838320490152L;
    private String msg;

    public void getMsg() {
        System.out.println("Your message:"+msg);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void init(){
        System.out.println("Bean is going through init.");
    }

    public void destroy(){
        System.out.println("Bean will destroy now.");
    }
}
