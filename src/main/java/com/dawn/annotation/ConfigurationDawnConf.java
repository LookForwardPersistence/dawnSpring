package com.dawn.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Dawn on 2020-04-09.
 */
@Configuration
public class ConfigurationDawnConf {
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Dawn dawn(){
        return new Dawn();
    }

}
