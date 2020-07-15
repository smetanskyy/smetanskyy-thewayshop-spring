package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping({"/", "/home"})
    public String Home(){
        return "home";
    }

    @RequestMapping("/about")
    public String About(Model model){
        model.addAttribute("title", "About Us");
        return "about";
    }

    @RequestMapping("/service")
    public String Service(Model model){
        model.addAttribute("title", "Services");
        return "service";
    }

    @RequestMapping("/contact")
    public String Contact(Model model){
        model.addAttribute("title", "Contact Us");
        return "contact";
    }
}
