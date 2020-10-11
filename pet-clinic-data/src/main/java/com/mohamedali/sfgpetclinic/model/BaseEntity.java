package com.mohamedali.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private static final Long serialUUid = 1L;

    // Using box types vs primitives
    private Long id;

    public BaseEntity(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
