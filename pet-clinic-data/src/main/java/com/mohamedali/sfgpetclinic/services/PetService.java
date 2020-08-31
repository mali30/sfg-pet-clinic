package com.mohamedali.sfgpetclinic.services;

import com.mohamedali.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByID(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
