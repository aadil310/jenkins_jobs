package com.sample.product.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
Author Adil khan
version: java18
 */
@RestController
@RequestMapping("/api/test")
public class ProductController {
	@GetMapping("/user")
	public String getUser() {
		return "Hi I'm using Jenkins";
	}

}
