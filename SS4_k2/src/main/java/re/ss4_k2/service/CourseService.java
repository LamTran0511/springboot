package re.ss4_k2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import re.ss4_k2.dto.request.CourseCreateRequest;
import re.ss4_k2.dto.request.CourseUpdateRequest;
import re.ss4_k2.entity.Course;
import re.ss4_k2.entity.Instructor;
import re.ss4_k2.exception.ResourceNotFoundException;
import re.ss4_k2.repository.CourseRepository;
import re.ss4_k2.repository.InstructorRepository;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private final InstructorRepository instructorRepository;

    public void createCourse(re.ss4_k2.service.CourseCreateRequest req) {
        Instructor instructor = instructorRepository.findById(req.getInstructorId())
                .orElseThrow(() -> new re.ss4_k2.service.ResourceNotFoundException("Instructor not found with id = " + req.getInstructorId()));

        Course course = new Course();
        course.setTitle(req.getTitle());
        course.setStatus(req.getStatus());
        course.setInstructor(instructor);

        courseRepository.save(course);
    }

    public void updateCourse(Long id, CourseUpdateRequest req) {
        Course course = courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with id = " + id));

        Instructor instructor = instructorRepository.findById(req.getInstructorId())
                .orElseThrow(() -> new ResourceNotFoundException("Instructor not found with id = " + req.getInstructorId()));

        course.setTitle(req.getTitle());
        course.setStatus(req.getStatus());
        course.setInstructor(instructor);

        courseRepository.save(course);
    }
}