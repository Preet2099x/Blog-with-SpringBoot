package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class BlogController {
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/about")
	public String about()
	{
		return "about";
	}
	
	@GetMapping("/contact")
	public String contact()
	{
		return "contact";
	}

}
