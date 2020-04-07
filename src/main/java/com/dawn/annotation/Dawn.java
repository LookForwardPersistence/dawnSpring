package com.dawn.annotation;

import org.springframework.beans.factory.annotation.Required;

import java.io.Serializable;

/**
 * @Required 必填
 * Created by Dawn on 2020-04-07.
 */
public class Dawn implements Serializable{
    private static final long serialVersionUID = 1650515295497570131L;
    private String name;

    private String address;

    public String getName() {
        System.out.println("name:"+name);
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        System.out.println("address:"+address);
        return address;
    }

    @Required
    public void setAddress(String address) {
        this.address = address;
    }
}
