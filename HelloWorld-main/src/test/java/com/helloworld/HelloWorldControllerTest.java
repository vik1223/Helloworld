package com.helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;;


@SpringBootTest(webEnvironment = RANDOM_PORT)
@RunWith(SpringRunner.class)
public class HelloWorldControllerTest {

	@LocalServerPort
	int port;
		
	RestTemplate restTemplate = new RestTemplate();
	
	@Test
	public void getHelloWorld_success() {
		String url = "http://localhost:"+port+"/hello";
		assertEquals(this.restTemplate.getForObject(url, String.class), "Hello, World!");
	}
}
