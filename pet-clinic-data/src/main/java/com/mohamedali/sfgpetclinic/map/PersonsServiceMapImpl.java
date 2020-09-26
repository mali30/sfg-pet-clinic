package com.mohamedali.sfgpetclinic.map;

import com.mohamedali.sfgpetclinic.model.Person;
import com.mohamedali.sfgpetclinic.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PersonsServiceMapImpl extends AbstractMapService<Person, Long> implements CrudService<Person, Long> {
    @Override
    public Set<Person> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Person person) {
        super.delete(person);
    }

    @Override
    public Person save(Person person) {
       return super.save(person.getId(), person);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }

    @Override
    public Person findByID(Long id) {
        return super.findByID(id);
    }
}
