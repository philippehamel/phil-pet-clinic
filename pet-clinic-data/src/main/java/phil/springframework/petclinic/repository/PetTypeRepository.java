package phil.springframework.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import phil.springframework.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
