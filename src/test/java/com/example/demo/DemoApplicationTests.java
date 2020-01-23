package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class DemoApplicationTests {

	@Value("${main-value:#{null}}")
	private String mainValue;
	@Value("${test-value:#{null}}")
	private String testValue;

	@Test
	void testMainValue() {

		assertThat(mainValue).contains("main");

	}

	@Test
	void testTestValue() {

		assertThat(testValue).contains("test");

	}

}
