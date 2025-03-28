package phil.springframework.petclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class Owner extends Person{
    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets = new HashSet<>();
}
