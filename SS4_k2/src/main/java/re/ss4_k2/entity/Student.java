package re.ss4_k2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "students")
public class Student {
    @Id
    private Long id;
    @Column
    private String name;
    private String email;

    @OneToMany(mappedBy = "student")
    private List<StudentEnrollment> enrollments;
}
