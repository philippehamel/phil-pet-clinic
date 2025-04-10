package phil.springframework.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import phil.springframework.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
