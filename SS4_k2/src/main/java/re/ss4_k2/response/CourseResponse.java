package re.ss4_k2.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CourseResponse {
    private Long id;
    private String title;
    private String status;

    private InstructorShortResponse instructor;
    private List<EnrollmentResponse> enrollments;
}