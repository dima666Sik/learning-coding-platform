package ua.platform.coding.learning.domain.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_id_seq")
    @SequenceGenerator(name = "course_id_seq", sequenceName = "course_id_seq", allocationSize = 1)
    private Long id;
    private String refToLesson;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;
    @OneToMany(mappedBy = "lesson")
    private Set<FeedbackToLesson> feedbacksToLesson;
}
