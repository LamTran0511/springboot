package re.ss4_k2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import re.ss4_k2.entity.Course;
import re.ss4_k2.entity.Student;
import re.ss4_k2.entity.StudentEnrollment;
import re.ss4_k2.exception.ResourceNotFoundException;
import re.ss4_k2.repository.CourseRepository;
import re.ss4_k2.repository.StudentEnrollmentRepository;
import re.ss4_k2.repository.StudentRepository;

@Service
@RequiredArgsConstructor
public class StudentEnrollmentService {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;
    private final StudentEnrollmentRepository studentEnrollmentRepository;

    public void enrollStudent(Long studentId, Long courseId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id = " + studentId));

        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with id = " + courseId));

        StudentEnrollment studentEnrollment = new StudentEnrollment();
        studentEnrollment.setStudent(student);
        studentEnrollment.setCourse(course);

        studentEnrollmentRepository.save(studentEnrollment);
    }
}