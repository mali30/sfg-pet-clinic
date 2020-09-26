package com.mohamedali.sfgpetclinic.controllers;

import com.mohamedali.sfgpetclinic.services.VetService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping("/vets")
    public String listVets(Model model) {
        model.addAttribute("vets list" , vetService.findAll());
        return "vets page";
    }
}
