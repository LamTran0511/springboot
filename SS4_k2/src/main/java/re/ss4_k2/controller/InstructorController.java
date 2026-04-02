package re.ss4_k2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import re.ss4_k2.dto.request.InstructorCreateRequest;
import re.ss4_k2.dto.response.ApiResponse;
import re.ss4_k2.service.InstructorService;

@RestController
@RequestMapping("/instructors")
@RequiredArgsConstructor
public class InstructorController {

    private final InstructorService instructorService;

    @PostMapping
    public ResponseEntity<ApiResponse<Object>> createInstructor(@RequestBody InstructorCreateRequest request) {
        instructorService.createInstructor(request);
        return new ResponseEntity<>(
                new ApiResponse<>("Instructor Created Successfully", true, null),
                HttpStatus.CREATED
        );
    }
}