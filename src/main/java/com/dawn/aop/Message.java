package com.dawn.aop;

import java.io.Serializable;

/**
 * Created by Dawn on 2020-04-09.
 */
public class Message implements Serializable {

    private static final long serialVersionUID = 3328424532338942470L;
    private Integer age;

    private String address;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }
}
