package kg.infoservice.itcenter.repository;

import kg.infoservice.itcenter.model.CurCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurCourseRepository extends JpaRepository<CurCourse, Integer> {
}
