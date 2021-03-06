package com.mohamedali.sfgpetclinic.bootstrap;

import com.mohamedali.sfgpetclinic.model.Owner;
import com.mohamedali.sfgpetclinic.model.Vet;
import com.mohamedali.sfgpetclinic.services.OwnerService;
import com.mohamedali.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
    Spring boot way of loading data on startup
 */
@Component // becomes spring bean and gets registered in spring context
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    /*
        Injected and managed by spring context
     */
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner = new Owner();
        owner.setFirstName("Moe");
        owner.setLastName("M");

        ownerService.save(owner);

        Owner owner1 = new Owner();
        owner.setFirstName("Bob");
        owner.setLastName("Tom");

        ownerService.save(owner1);

        System.out.println("Loading Owners");

        Vet vet = new Vet();
        vet.setFirstName("Dog");
        vet.setLastName("Cat");

        vetService.save(vet);


        Vet vet1 = new Vet();
        vet.setFirstName("Mouse");
        vet.setLastName("Tiger");

        vetService.save(vet1);

        System.out.println("Loading Vets...");







    }
}
