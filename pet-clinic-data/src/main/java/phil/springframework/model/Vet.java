package phil.springframework.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Vet extends Person{
    private Set<Speciality> specialities = new HashSet<>();
}
