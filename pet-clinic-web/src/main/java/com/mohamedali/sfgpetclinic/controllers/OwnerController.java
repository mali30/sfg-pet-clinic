package com.mohamedali.sfgpetclinic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OwnerController {

    @RequestMapping("/owner")
    public String getOwners() {
        return "owners list";
    }

}
