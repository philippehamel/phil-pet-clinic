package phil.petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import phil.petclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
