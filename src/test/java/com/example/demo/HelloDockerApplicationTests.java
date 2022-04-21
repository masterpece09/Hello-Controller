package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@RunWith(SpringRunner.class)
@WebMvcTest
class HelloDockerApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;


	@Test
	void contextLoads() {
	}
	
	@Test
	public void testMockMVC() throws Exception {
		MvcResult result = mockMvc.perform(get("/hello").contentType("application/json")).andExpect(status().isOk()).andReturn();
		assertThat(result.getResponse().getContentAsString()).isEqualTo("Hello World from Docker!");
		
	}
	
	

}
