package phil.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import phil.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
