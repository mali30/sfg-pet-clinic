package com.mohamedali.sfgpetclinic.controllers;

import com.mohamedali.sfgpetclinic.services.OwnerService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping("/owner")
    public String getOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners list";
    }

}
