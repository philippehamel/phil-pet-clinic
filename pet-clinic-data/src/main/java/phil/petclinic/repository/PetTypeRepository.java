package phil.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import phil.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
