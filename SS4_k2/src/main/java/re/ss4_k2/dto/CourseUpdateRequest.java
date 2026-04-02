package re.ss4_k2.dto;

import re.ss4_k2.entity.CourseStatus;

public class CourseUpdateRequest {
    private String title;
    private CourseStatus status;
    private Long instructorId;
}
