package phil.springframework.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import phil.springframework.petclinic.model.Owner;
import phil.springframework.petclinic.model.Vet;
import phil.springframework.petclinic.services.OwnerService;
import phil.springframework.petclinic.services.VetService;

@Component
public class DataInitializer implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Doe");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jane");
        owner2.setLastName("Smith");
        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Dr. Mike");
        vet1.setLastName("Johnson");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Dr. Sarah");
        vet2.setLastName("Williams");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
