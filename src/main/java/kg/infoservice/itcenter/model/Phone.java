package kg.infoservice.itcenter.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Data
@Table(name = "phones")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Pattern(regexp = "^[0-9]",message = "Введите корректный номер")
    private String phone;

    private boolean active;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher person;

}
