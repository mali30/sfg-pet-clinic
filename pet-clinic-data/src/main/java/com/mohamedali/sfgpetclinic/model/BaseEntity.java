package com.mohamedali.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    // Using box types vs primitives
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
