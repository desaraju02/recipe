package com.nag.recipe.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    public String showIndexPage()
    {
        System.out.println("Testing for Live Reload of Spring DevTools ....1234 ..");
        return "index";

    }
}
