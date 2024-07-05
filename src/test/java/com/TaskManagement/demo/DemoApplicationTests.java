package com.TaskManagement.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
		"spring.datasource.url=jdbc:postgresql://localhost:5432/t_management_db",
		"spring.datasource.username=postgres",
		"spring.datasource.password=postgres1"
})
public class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
}
