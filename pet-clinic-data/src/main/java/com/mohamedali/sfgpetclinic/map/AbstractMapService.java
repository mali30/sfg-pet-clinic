package com.mohamedali.sfgpetclinic.map;

import com.mohamedali.sfgpetclinic.model.BaseEntity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.NoSuchElementException;

public abstract class AbstractMapService<T extends BaseEntity , ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findByID(ID id) {
        return map.get(id);
    }

    // save method is now more like how spring data jpa's is
    T save(T type){
        if(type != null) {
            if(type.getId() == null) {
                type.setId(getNextId());
            }
            map.put(type.getId(), type);
        }else{
            throw new RuntimeException("Object cannot be null");
        }
        return type;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T type){
        map.entrySet().removeIf( obj ->
                obj.getValue() == type);
    }

    private Long getNextId(){
        long nextId;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}
