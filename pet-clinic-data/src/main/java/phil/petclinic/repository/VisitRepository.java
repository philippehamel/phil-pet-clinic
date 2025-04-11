package phil.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import phil.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
