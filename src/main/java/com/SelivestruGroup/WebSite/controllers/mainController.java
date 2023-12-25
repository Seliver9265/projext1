package com.SelivestruGroup.WebSite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class mainController {

    @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("title", "MainPage");
        return "home";
    }
    @GetMapping("/aboutus")
    public String about( Model model) {
        model.addAttribute("title", "about us");
        return "about";
    }

}