package ua.platform.coding.learning.service;

import ua.platform.coding.learning.domain.model.Course;

import java.util.Set;

public interface CourseApiService {
    Set<Course> getCourses();
    Course getCourseById(Long id);
}
