package model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Pet {
    private String name;
    private PetType pettype;
    private Owner owner;
    private LocalDate birthday;
    private Set<Visit> visits = new HashSet<>();
}
