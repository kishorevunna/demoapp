package com.springbootdemo.demoapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DemoController {
	
	@RequestMapping(path = "/greet")
	public String greet() {	
		//logical view
		return "hello";
	}

}

