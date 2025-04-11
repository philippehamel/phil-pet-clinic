package phil.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "specialties")
@Setter
@Getter
@NoArgsConstructor
public class Speciality extends BaseEntity{

    @Column(name = "description")
    private String description;

}
