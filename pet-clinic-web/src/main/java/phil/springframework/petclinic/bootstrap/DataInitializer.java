package phil.springframework.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import phil.springframework.petclinic.model.*;
import phil.springframework.petclinic.services.OwnerService;
import phil.springframework.petclinic.services.PetTypeService;
import phil.springframework.petclinic.services.SpecialityService;
import phil.springframework.petclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataInitializer implements CommandLineRunner {
    // This class is used to load initial data into the application
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataInitializer(OwnerService ownerService,
                           VetService vetService,
                           PetTypeService petTypeService,
                           SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    private void loadData() {

        PetType dog = new PetType();
        dog.setName("Dog");
        petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        petTypeService.save(cat);

        System.out.println("Loaded Pet Types...");

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");

        System.out.println("Loaded Specialities...");

        Owner owner1 = new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Doe");
        owner1.setAddress("123 Main St");
        owner1.setCity("Springfield");
        owner1.setTelephone("123-456-7890");
        ownerService.save(owner1);

        Pet johnsPet = new Pet();
        johnsPet.setPetType(dog);
        johnsPet.setOwner(owner1);
        johnsPet.setName("Buddy");
        johnsPet.setBirthday(LocalDate.now());

        Owner owner2 = new Owner();
        owner2.setFirstName("Jane");
        owner2.setLastName("Smith");
        owner2.setAddress("456 Elm St");
        owner2.setCity("Springfield");
        owner2.setTelephone("987-654-3210");
        ownerService.save(owner2);

        Pet janesPet = new Pet();
        janesPet.setPetType(cat);
        janesPet.setOwner(owner2);
        janesPet.setName("Whiskers");
        janesPet.setBirthday(LocalDate.now());

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Dr. Mike");
        vet1.setLastName("Johnson");
        vet1.getSpecialities().add(surgery);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Dr. Sarah");
        vet2.setLastName("Williams");
        vet2.getSpecialities().add(radiology);
        vet2.getSpecialities().add(dentistry);
        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if (count == 0) {
            System.out.println("Loading data...");
            loadData();
        } else {
            System.out.println("Data already loaded...");
        }

    }
}
