package phil.petclinic.service.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import phil.petclinic.model.Visit;
import phil.petclinic.repository.VisitRepository;
import phil.petclinic.service.VisitService;

import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSpringDataJpaServcie implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSpringDataJpaServcie(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new java.util.HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
