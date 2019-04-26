package kg.infoservice.itcenter.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "teacher")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Teacher extends Person {

    /*@Size(min = 10, max = 200, message = "Некорректный размер ФИО.")
    private String name;*/

    @Min(value = 2, message = "Опыт работы должен превышать 2 года")
    private int experience;

    @Email(message = "Email should be valid")
    private String email;


}
