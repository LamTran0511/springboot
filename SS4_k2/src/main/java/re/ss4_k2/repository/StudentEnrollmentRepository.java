package re.ss4_k2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import re.ss4_k2.entity.StudentEnrollment;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentEnrollmentRepository extends JpaRepository<StudentEnrollment, Long> {
    boolean existsByCourseIdAndStudentId(Long courseId, Long studentId);
    Optional<StudentEnrollment> findByStudentIdAndCourseId(Long studentId, Long courseId);
    @Query("SELECT se FROM StudentEnrollment se WHERE se.course.id = :courseId AND LOWER(se.student.name) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<StudentEnrollment> searchEnrollments(Long courseId, String keyword);
}