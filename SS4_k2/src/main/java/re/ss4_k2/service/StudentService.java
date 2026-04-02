package re.ss4_k2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import re.ss4_k2.dto.request.StudentCreateRequest;
import re.ss4_k2.entity.Student;
import re.ss4_k2.repository.StudentRepository;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public void createStudent(StudentCreateRequest req) {
        Student student = new Student();
        student.setName(req.getName());
        student.setEmail(req.getEmail());

        studentRepository.save(student);
    }
}