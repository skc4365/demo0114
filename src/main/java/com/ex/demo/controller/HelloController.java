package com.ex.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String hello_0() {
		return "hello_0";
	}

	@GetMapping("/1")
	public String hello_1() {
		return "hello_1";
	}

	@GetMapping("/2")
	public String hello_2() {
		return "hello_2";
	}

}
