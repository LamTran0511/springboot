package re.ss4_k2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import re.ss4_k2.dto.request.StudentCreateRequest;
import re.ss4_k2.dto.response.ApiResponse;
import re.ss4_k2.service.StudentService;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<ApiResponse<Object>> createStudent(@RequestBody StudentCreateRequest request) {
        studentService.createStudent(request);
        return new ResponseEntity<>(
                new ApiResponse<>("Student Created Successfully", true, null),
                HttpStatus.CREATED
        );
    }
}