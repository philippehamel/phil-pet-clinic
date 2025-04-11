package phil.springframework.petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import phil.springframework.petclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
