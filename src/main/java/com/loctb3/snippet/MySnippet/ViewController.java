package com.loctb3.snippet.MySnippet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping(value = {"/"})
    public String homePage(){
        return "home";
    }
}
