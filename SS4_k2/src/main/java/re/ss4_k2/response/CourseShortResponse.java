package re.ss4_k2.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import re.ss4_k2.model.CourseStatus;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CourseShortResponse {
    private Long id;
    private String title;
    private re.ss4_k2.model.CourseStatus courseStatus;
}