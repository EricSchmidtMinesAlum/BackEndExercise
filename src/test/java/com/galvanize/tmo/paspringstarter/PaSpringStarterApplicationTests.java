package com.galvanize.tmo.paspringstarter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class PaSpringStarterApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	void isHealthy() throws Exception {
		mockMvc.perform(get("/health"))
				.andExpect(status().isOk());
	}


	//Test that the array is first empty
	@Test
	public void getEmptyFirst() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/api/books").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("[]")));
	}
/*8
	@Test
	public void createEmployeeAPI() throws Exception 
	{
		mockMvc.perform( MockMvcRequestBuilders
		  .post("/api/books")
		  .content(asJsonString(new Books(null, "firstName4", "lastName4", "email4@mail.com")))
		  .contentType(MediaType.APPLICATION_JSON)
		  .accept(MediaType.APPLICATION_JSON))
		  .andExpect(status().isCreated())
		  .andExpect(MockMvcResultMatchers.jsonPath("$.employeeId").exists());
	}
	 
	//{"author":"Douglas Adams","title":"The Hitchhikers Guide to the Galaxy","yearPublished":1979}
	//{"id":1, "author":"Douglas Adams","title":"The Hitchhikers Guide to the Galaxy","yearPublished":1979}*/

}