package com.dawn.di;

/**
 * 基于构造函数依赖注入
 * Created by Dawn on 2020-04-06.
 */
public class TextEditor {
   private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor");
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }

}
