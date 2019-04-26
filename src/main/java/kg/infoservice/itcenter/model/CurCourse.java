package kg.infoservice.itcenter.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Data
public class CurCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private boolean active;
    private Date add_date;
    private LocalTime course_time;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "course_id")
    private Course course;
}
