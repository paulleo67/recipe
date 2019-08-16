package com.leopaul.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = {"", "/", "/index"})
    public String getIndexPage() {
        System.out.println("It's not working as per request");
        return "index";

    }
}
