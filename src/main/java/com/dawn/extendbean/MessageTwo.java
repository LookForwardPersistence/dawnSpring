package com.dawn.extendbean;

import java.io.Serializable;

/**
 * Created by Dawn on 2020-04-05.
 */
public class MessageTwo implements Serializable {
    private static final long serialVersionUID = 7856987756579728278L;
    private String name;

    private String addr;

    private String job;

    public String getName() {
        System.out.println("MessageTwo:"+name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        System.out.println("MessageTwo:" +addr);
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getJob() {
        System.out.println("MessageTwo:"+job);
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
