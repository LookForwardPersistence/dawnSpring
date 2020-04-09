package com.dawn.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Spring还使用基于 JSR-250 注释，它包括 @PostConstruct， @PreDestroy 和 @Resource 注释。
 * Created by Dawn on 2020-04-09.
 */
public class JSR250Dawn {

    private String message;

    public String getMessage() {
        System.out.println("message:"+message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //相当于 bean中的 init-method
    @PostConstruct
    public void init(){
        System.out.println("Bean is going through init.");
    }

    //相当于 bean中的 destroy-method
    @PreDestroy
    public void destroy(){
        System.out.println("Bean will destroy now");
    }
}
