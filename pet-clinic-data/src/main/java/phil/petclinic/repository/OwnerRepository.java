package phil.petclinic.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import phil.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

}
