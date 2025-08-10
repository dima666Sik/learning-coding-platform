package ua.platform.coding.learning.service;

import org.springframework.stereotype.Service;
import ua.platform.coding.learning.domain.model.Course;

import java.util.Set;
@Service
public class CourseApiServiceImpl implements CourseApiService {
    @Override
    public Set<Course> getCourses() {
        return null;
    }

    @Override
    public Course getCourseById(Long id) {
        return null;
    }
}
