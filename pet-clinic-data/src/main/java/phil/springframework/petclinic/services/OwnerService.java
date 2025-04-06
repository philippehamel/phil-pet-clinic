package phil.springframework.petclinic.services;

import phil.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
