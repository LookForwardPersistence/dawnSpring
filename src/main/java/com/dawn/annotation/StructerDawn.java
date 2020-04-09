package com.dawn.annotation;

import com.dawn.di.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Autowired注解 构造函数 注入bean
 * Created by Dawn on 2020-04-09.
 */
public class StructerDawn {

    private SpellChecker spellChecker;

    @Autowired
    public StructerDawn(SpellChecker spellChecker) {
        System.out.println("Inside Structer constructor");
        this.spellChecker = spellChecker;
    }

    public void spellChecking(){
        spellChecker.checkSpelling();
    }
}
