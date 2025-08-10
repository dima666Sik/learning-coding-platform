package ua.platform.coding.learning.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.platform.coding.learning.domain.model.Course;
import ua.platform.coding.learning.service.CourseApiService;

import java.util.Set;

@RestController
@RequestMapping(("api"))
@RequiredArgsConstructor
public class CoursesApiController {
    private final CourseApiService courseApiService;
    @GetMapping("/courses")
    public ResponseEntity<Set<Course>> getCourses() {
        return ResponseEntity.ok(courseApiService.getCourses());
    }
    @GetMapping("/courses/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable Long id) {
        return ResponseEntity.ok(courseApiService.getCourseById(id));
    }
}
