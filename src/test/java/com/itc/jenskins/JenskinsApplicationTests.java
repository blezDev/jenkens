package com.itc.jenskins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenskinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenskinsApplication.class);

	@Test
	void contextLoads() {

		logger.info("*********test case executed **************");
		Assertions.assertEquals(true,true);
	}

}
