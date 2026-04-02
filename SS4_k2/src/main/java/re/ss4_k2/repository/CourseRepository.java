package re.ss4_k2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import re.ss4_k2.entity.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}