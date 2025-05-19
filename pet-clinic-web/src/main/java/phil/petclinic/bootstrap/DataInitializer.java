package phil.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import phil.petclinic.model.*;
import phil.petclinic.service.*;

import java.time.LocalDate;

@Component
public class DataInitializer implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataInitializer(OwnerService ownerService,
                           VetService vetService,
                           PetTypeService petTypeService,
                           SpecialityService specialityService,
                           VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;

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
        specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        specialityService.save(dentistry);

        System.out.println("Loaded Specialities...");

        Owner owner1 = new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Doe");
        owner1.setAddress("123 Main St");
        owner1.setCity("Springfield");
        owner1.setTelephone("123-456-7890");

        Pet johnsPet = new Pet();
        johnsPet.setPetType(dog);
        johnsPet.setOwner(owner1);
        johnsPet.setName("Buddy");
        johnsPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(johnsPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jane");
        owner2.setLastName("Smith");
        owner2.setAddress("456 Elm St");
        owner2.setCity("Springfield");
        owner2.setTelephone("987-654-3210");

        Pet janesPet = new Pet();
        janesPet.setPetType(cat);
        janesPet.setOwner(owner2);
        janesPet.setName("Whiskers");
        janesPet.setBirthDate(LocalDate.now());
        owner2.getPets().add(janesPet);
        ownerService.save(owner2);

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

        Visit catVisit = new Visit();
        catVisit.setPet(janesPet);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Checkup");
        visitService.save(catVisit);

        Visit dogVisit = new Visit();
        dogVisit.setPet(johnsPet);
        dogVisit.setDate(LocalDate.now());
        dogVisit.setDescription("Checkup");
        visitService.save(dogVisit);

        System.out.println("Loaded Visits...");

        System.out.println("Data loading complete.");
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
