package re.ss4_k2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import re.ss4_k2.dto.request.CourseCreateRequest;
import re.ss4_k2.dto.request.CourseUpdateRequest;
import re.ss4_k2.dto.response.ApiResponse;
import re.ss4_k2.service.CourseService;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @PostMapping
    public ResponseEntity<ApiResponse<Object>> createCourse(@RequestBody CourseCreateRequest request) {
        courseService.createCourse(request);
        return new ResponseEntity<>(
                new ApiResponse<>("Course Created Successfully", true, null),
                HttpStatus.CREATED
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<Object>> updateCourse(
            @PathVariable Long id,
            @RequestBody CourseUpdateRequest request
    ) {
        courseService.updateCourse(id, request);
        return new ResponseEntity<>(
                new ApiResponse<>("Course Updated Successfully", true, null),
                HttpStatus.OK
        );
    }
}