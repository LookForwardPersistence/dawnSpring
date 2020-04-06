package com.dawn.di;

/**
 * 基于值函数依赖注入
 * Created by Dawn on 2020-04-06.
 */
public class ValueMethod {

    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Insite setSpellChecker");
        this.spellChecker = spellChecker;
    }

    public void spellChecker(){
        spellChecker.checkSpelling();
    }
}
