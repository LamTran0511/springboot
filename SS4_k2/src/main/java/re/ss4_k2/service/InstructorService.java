package re.ss4_k2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import re.ss4_k2.dto.request.InstructorCreateRequest;
import re.ss4_k2.entity.Instructor;
import re.ss4_k2.repository.InstructorRepository;

@Service
@RequiredArgsConstructor
public class InstructorService {

    private final InstructorRepository instructorRepository;

    public void createInstructor(InstructorCreateRequest req) {
        Instructor instructor = new Instructor();
        instructor.setName(req.getName());
        instructor.setEmail(req.getEmail());

        instructorRepository.save(instructor);
    }
}