package phil.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;
import phil.springframework.petclinic.model.Speciality;
import phil.springframework.petclinic.model.Vet;
import phil.springframework.petclinic.services.SpecialityService;
import phil.springframework.petclinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {

        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {

        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if(!object.getSpecialities().isEmpty()){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {

        super.delete(object);
    }
}
