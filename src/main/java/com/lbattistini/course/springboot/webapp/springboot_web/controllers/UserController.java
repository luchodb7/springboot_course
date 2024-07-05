package com.lbattistini.course.springboot.webapp.springboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @GetMapping("/details")    
    public String details (Model model) {
        model.addAttribute("title", "Hola Mundo - Springboot - Model");
        model.addAttribute("name", "Luciano");
        model.addAttribute("lastname", "Battistini");
        return "details";
    }

    @GetMapping("/detailsMap")    
    public String details (Map<String,Object> model) {
        model.put("title", "Hola Mundo - Springboot - Map");
        model.put("name", "Luciano");
        model.put("lastname", "Battistini");
        return "details";
    }
}
