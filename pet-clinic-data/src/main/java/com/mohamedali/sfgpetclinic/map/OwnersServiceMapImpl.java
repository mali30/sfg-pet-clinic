package com.mohamedali.sfgpetclinic.map;

import com.mohamedali.sfgpetclinic.model.Owner;
import com.mohamedali.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnersServiceMapImpl extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner owner) {
       super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);

    }

    @Override
    public Owner findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
