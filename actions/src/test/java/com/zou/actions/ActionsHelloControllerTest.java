package com.zou.actions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ActionsHelloControllerTest {

	private ActionsHelloController controller;

	@BeforeEach
	void setUp(){
		controller = new ActionsHelloController();
	}

	@Test
	void helloWorld() {
		assertEquals("Hello World", controller.helloWorld());
	}
}