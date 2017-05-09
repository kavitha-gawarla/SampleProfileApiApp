package com.profile.controller;

import static org.junit.Assert.fail;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ProfileControllerTest {

	@Autowired  
	private MockMvc mockMvc;

   
        
	@Test
	public void testViewProfile() {
		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/profile/viewprofile").accept(MediaType.ALL))
			.andExpect(status().isOk())
			.andExpect(view().name("startprofile"));
		} catch (Exception e) {
			
			fail("Not yet implemented");
		}
	}

}
