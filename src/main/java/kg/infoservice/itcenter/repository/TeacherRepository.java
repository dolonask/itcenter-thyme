package kg.infoservice.itcenter.repository;

import kg.infoservice.itcenter.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    List<Teacher> findAllByActive(boolean active);

    boolean existsById(int id);

}
