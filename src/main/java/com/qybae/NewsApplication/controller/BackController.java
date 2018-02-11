package com.qybae.NewsApplication.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BackController {

	@GetMapping("/payload")
	public String payload() {
		
		return "view/payload/payload";
	}
}
