package com.mohamedali.sfgpetclinic.map;

import com.mohamedali.sfgpetclinic.model.Vet;
import com.mohamedali.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetsServiceMapImpl extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet findByID(Long id) {
        return super.findByID(id);
    }
}
