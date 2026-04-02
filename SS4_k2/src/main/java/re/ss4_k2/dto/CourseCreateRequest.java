package re.ss4_k2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import re.ss4_k2.entity.CourseStatus;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CourseCreateRequest {
    private String title;
    private CourseStatus status;
    private Long instructorId;
}
