package re.ss4_k2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import re.ss4_k2.entity.Instructor;
@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}