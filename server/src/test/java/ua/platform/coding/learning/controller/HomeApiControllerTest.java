package ua.platform.coding.learning.controller;

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
import ua.platform.coding.learning.service.HomeApiService;

@SpringBootTest
class HomeApiControllerTest {
    @Mock
    private HomeApiService homeApiService;
    @InjectMocks
    private HomeApiController homeApiController;
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(homeApiController).build();
    }

    @Test
    void getTitle() throws Exception {
        // given
        String result = "Title";

        //when
        Mockito
            .when(homeApiService.getTitle())
            .thenReturn(result);

        //then
        mockMvc.perform(MockMvcRequestBuilders
            .get("/api/home/title")
            .accept(MediaType.TEXT_PLAIN))
            .andExpect(MockMvcResultMatchers.status().is(200))
            .andExpect(MockMvcResultMatchers.content().string(result));
    }

    @Test
    void getDescription() throws Exception {
        // given
        String result = "Description";

        //when
        Mockito
            .when(homeApiService.getDescription())
            .thenReturn(result);

        //then
        mockMvc.perform(MockMvcRequestBuilders
                .get("/api/home/description")
                .accept(MediaType.TEXT_PLAIN))
            .andExpect(MockMvcResultMatchers.status().is(200))
            .andExpect(MockMvcResultMatchers.content().string(result));
    }
}