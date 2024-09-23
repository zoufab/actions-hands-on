package com.zou.actions;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(("/actions"))
@RequiredArgsConstructor
public class ActionsHelloController {

	@GetMapping("/hello")
	public String helloWorld(){

		log.info("hello world - it works");

		return "Hello World";
	}
}
