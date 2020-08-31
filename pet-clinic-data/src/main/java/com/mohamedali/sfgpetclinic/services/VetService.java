package com.mohamedali.sfgpetclinic.services;

import com.mohamedali.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByID(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
