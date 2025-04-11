package phil.petclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public class Person extends BaseEntity{

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

}
