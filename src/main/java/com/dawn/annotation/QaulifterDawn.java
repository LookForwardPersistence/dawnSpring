package com.dawn.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Dawn on 2020-04-09.
 */
public class QaulifterDawn {

    @Autowired
    @Qualifier("dawn")
    Dawn dawn;

    public QaulifterDawn() {
        System.out.println("Inside QaulifterDanw constructor");
    }

    public void printName(){
        System.out.println("name:"+dawn.getName());
    }

    public void printAddress(){
        System.out.println("address:"+dawn.getAddress());
    }
}
