package com.mohamedali.sfgpetclinic.model;

public class PetType extends BaseEntity {

    private String petName;

    public PetType(){
        super();
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}
