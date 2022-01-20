package com.hs.factory.psi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    
     
    @RequestMapping("/")
    public String index(Model model) {
        
        return "psi/home";
    }
}
