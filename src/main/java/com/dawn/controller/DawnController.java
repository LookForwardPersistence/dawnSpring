package com.dawn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Dawn on 2020-04-05.
 */
@Controller
@RequestMapping("/dawn")
public class DawnController {

    @RequestMapping(method = RequestMethod.GET)
    public String printDawn(Model model){
        model.addAttribute("message","Come on Dawn!!!");
        return "dawn";
    }
}
