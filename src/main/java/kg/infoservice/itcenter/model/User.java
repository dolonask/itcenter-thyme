package kg.infoservice.itcenter.model;


import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User extends Person{

    @Size(min = 5,max = 15,message = "Введите имя пользователя от 5 до 15 символов")
    private String username;

    @Size(min = 5,max = 15,message = "Введите пароль от 5 до 15 символов")
    private String password;

    private String phone;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
