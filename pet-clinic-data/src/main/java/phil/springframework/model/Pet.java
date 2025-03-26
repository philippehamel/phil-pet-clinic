package phil.springframework.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Pet extends BaseEntity{
    private String name;
    private PetType pettype;
    private Owner owner;
    private LocalDate birthday;
    //private Set<Visit> visits = new HashSet<>();
}
