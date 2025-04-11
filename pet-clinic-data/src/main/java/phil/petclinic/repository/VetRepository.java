package phil.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import phil.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
