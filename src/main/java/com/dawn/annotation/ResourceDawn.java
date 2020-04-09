package com.dawn.annotation;

import com.dawn.di.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Resource注释
 * Created by Dawn on 2020-04-09.
 */
public class ResourceDawn {
//    @Autowired
    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    @Resource(name = "spellChecker")
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
