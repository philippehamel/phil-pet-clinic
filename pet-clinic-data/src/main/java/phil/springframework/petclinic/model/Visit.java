package phil.springframework.petclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "visits")
@Getter
@Setter
@NoArgsConstructor
public class Visit extends BaseEntity{

    @ManyToOne
    private Pet pet;

    @Column(name = "visit_date")
    private LocalDate date;

    @Column(name = "description")
    private String description;

}
