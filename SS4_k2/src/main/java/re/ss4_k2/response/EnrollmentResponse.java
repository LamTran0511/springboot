package re.ss4_k2.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EnrollmentResponse {
    private Long id;
    private StudentShortResponse student;
    private CourseShortResponse course;
    private String enrolledAt;
}