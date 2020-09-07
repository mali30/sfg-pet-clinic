package com.mohamedali.sfgpetclinic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VetController {

    @RequestMapping("/vets")
    public String listVets() {
        return "vets page";
    }
}
