package phil.springframework.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import phil.springframework.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
