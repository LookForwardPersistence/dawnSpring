package com.dawn.annotation;

import com.dawn.di.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Autowired 注解自动注入
 * Created by Dawn on 2020-04-09.
 */
public class AutowiredDawn {

    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    @Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellChecking(){
        spellChecker.checkSpelling();
    }
}
