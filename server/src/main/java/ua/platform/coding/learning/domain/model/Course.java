package ua.platform.coding.learning.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_id_seq")
    @SequenceGenerator(name = "course_id_seq", sequenceName = "course_id_seq", allocationSize = 1)
    private Long id;
    private String title;
    private String description;
    @OneToMany(mappedBy = "course")
    private Set<Lesson> lessonSet;
    @OneToMany(mappedBy = "course")
    private Set<FeedbackToCourse> feedbacksToCourse;
    @ManyToMany
    private Set<User> users;
}
