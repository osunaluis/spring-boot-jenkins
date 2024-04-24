package com.luis.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertTrue(true);
	}

	@Test
	void sampleTest(){
		Assertions.assertTrue(false);
	}

}
