package com.dawn.extendbean;

import java.io.Serializable;

/**
 * Created by Dawn on 2020-04-05.
 */
public class MessageOne implements Serializable {
    private static final long serialVersionUID = 8963244683908589610L;

    private String name;

    private String addr;

    public String getName() {
        System.out.println("MessageOne:"+name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        System.out.println("MessageOne:"+addr);
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
