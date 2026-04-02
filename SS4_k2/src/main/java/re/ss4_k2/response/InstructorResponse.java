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
public class InstructorResponse {
    private Long id;
    private String name;
    private String email;

    private List<CourseResponse> courses;
}
