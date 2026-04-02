package re.ss4_k2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import re.ss4_k2.dto.request.StudentEnrollmentCreateRequest;
import re.ss4_k2.dto.response.ApiResponse;
import re.ss4_k2.service.StudentEnrollmentService;

@RestController
@RequestMapping("/students-enrollments")
@RequiredArgsConstructor
public class StudentEnrollmentController {

    private final StudentEnrollmentService studentEnrollmentService;

    @PostMapping
    public ResponseEntity<ApiResponse<Object>> enrollStudent(
            @RequestBody StudentEnrollmentCreateRequest request
    ) {
        studentEnrollmentService.enrollStudent(request.getStudentId(), request.getCourseId());

        return new ResponseEntity<>(
                new ApiResponse<>("Student Enrolled Successfully", true, null),
                HttpStatus.OK
        );
    }
}