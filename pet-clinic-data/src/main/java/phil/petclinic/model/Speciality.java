package phil.petclinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
