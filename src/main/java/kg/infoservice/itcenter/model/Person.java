package kg.infoservice.itcenter.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@MappedSuperclass
@Data
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Size(min = 10, max = 200, message = "Некорректный размер ФИО.")
    private String name;

    private boolean active;

    @Temporal(TemporalType.TIMESTAMP)
    private Date add_date;
}
