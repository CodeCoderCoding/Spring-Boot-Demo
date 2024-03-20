package com.supremepole.springboottest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebAppConfiguration
@WebMvcTest(TestController.class)
@ComponentScan(value={"com.supremepole.springboottest"})
class A07SpringBootTestApplicationTests {
    @Autowired
    MockMvc mockMvc;
    @Autowired
    WebApplicationContext webApplicationContext;
    @MockBean
    TestService testService;
    @Test
    void contextLoads() {
    }
    @Test
    public void test() throws Exception {
        WebsiteDTO websiteDTO=new WebsiteDTO();
        websiteDTO.setName("尼尔的编程专栏");
        websiteDTO.setUrl("https://www.supremepole.com");
        mockMvc.perform(
                MockMvcRequestBuilders
                        .post("/website")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectToString(websiteDTO))
        )
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andDo(print());
    }

    private String objectToString(Object object) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        return mapper.writeValueAsString(object);
    }
}
