package ua.platform.coding.learning.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import ua.platform.coding.learning.domain.model.Course;
import ua.platform.coding.learning.service.CourseApiService;

import java.util.LinkedHashSet;
import java.util.Set;

@SpringBootTest
class CoursesApiControllerTest {
    @Mock
    private CourseApiService courseApiService;
    @InjectMocks
    private CoursesApiController coursesApiController;
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(coursesApiController).build();
    }

    @Test
    void getCourses() throws Exception {
        // given
        Set<Course> courseSet = new LinkedHashSet<>();
        courseSet.add(Course.builder()
            .title("Java Basics")
            .description("For beginners")
            .build());
        courseSet.add(Course.builder()
            .title("Java Basics 2")
            .description("For beginners 2")
            .build());

        //when
        Mockito
            .when(courseApiService.getCourses())
            .thenReturn(courseSet);

        //then
        mockMvc.perform(MockMvcRequestBuilders
                .get("/api/courses")
                .accept(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.status().is(200))
            .andExpect(MockMvcResultMatchers.content()
                .json(new ObjectMapper().writeValueAsString(courseSet)));
    }

    @Test
    void getCourseById() throws Exception {
        // given
        Course course = Course.builder()
            .id(1L)
            .title("Java Basics")
            .description("For beginners")
            .build();

        //when
        Mockito
            .when(courseApiService.getCourseById(course.getId()))
            .thenReturn(course);

        //then
        mockMvc.perform(MockMvcRequestBuilders
                .get("/api/courses/{id}")
                .accept(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.status().is(200))
            .andExpect(MockMvcResultMatchers.content()
                .json(new ObjectMapper().writeValueAsString(course)));
    }
}