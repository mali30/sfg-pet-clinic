package com.mohamedali.sfgpetclinic.services;

import com.mohamedali.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName (String lastName);

}
