package phil.springframework.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import phil.springframework.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

}
