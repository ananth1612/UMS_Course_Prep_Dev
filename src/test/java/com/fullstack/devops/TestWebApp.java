package com.fullstack.devops;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class TestWebApp extends DevopsApplicationTests {

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@BeforeEach 
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testgetUsers() throws Exception {
		mockMvc.perform(get("/api/users")).andExpect(status().isOk());
		/*
		 * .andExpect(content().contentType("application/json;charset=UTF-8"))
		 * .andExpect(jsonPath("$.name").value("emp1")).andExpect(jsonPath(
		 * "$.designation").value("manager"))
		 * .andExpect(jsonPath("$.empId").value("1")).andExpect(jsonPath("$.salary").
		 * value(3000));
		 */

	}
	@Test
	public void testAddUser() throws Exception {
		mockMvc.perform(get("/api/user/add1")).andExpect(status().isOk());
		
	}
	/*
	 * @Test public void testCreateUser() throws Exception {
	 * mockMvc.perform(post("/api/user/create")).andExpect(status().isOk());
	 * 
	 * }
	 * 
	 * @Test public void testUpdateUserId() throws Exception {
	 * mockMvc.perform(get("/api/update/{id}")).andExpect(status().isOk());
	 * 
	 * }
	 * 
	 * @Test public void testUpdateUser() throws Exception {
	 * mockMvc.perform(get("/api/update")).andExpect(status().isOk());
	 * 
	 * }
	 * 
	 * @Test public void testDeleteUserId() throws Exception {
	 * mockMvc.perform(get("/api/delete/{id}")).andExpect(status().isOk());
	 * 
	 * } public void testDeleteAll() throws Exception {
	 * mockMvc.perform(get("/api/deleteall")).andExpect(status().isOk());
	 * 
	 * }
	 */

}
