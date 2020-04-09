package com.dawn.annotation;

import com.dawn.di.SpellChecker;
import com.dawn.di.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Configuration
 * @Bean
 * Created by Dawn on 2020-04-09.
 */
public class ConfigurationApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationDawnConf.class);
        Dawn dawn = context.getBean(Dawn.class);
        dawn.setAddress("PingNan");
        dawn.getAddress();


        ApplicationContext context1 = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor textEditor = context1.getBean(TextEditor.class);
        textEditor.spellCheck();
    }
}
