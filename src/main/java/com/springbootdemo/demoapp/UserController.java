package com.springbootdemo.demoapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	User user;
	
	@Autowired
	Address addr;
	
	
	@GetMapping("/user")
	public User getUser() {
		addr.setCity("HYD");
		addr.setCountry("IND");
		addr.setZipcode("12345");
		
		user.setId(1);
		user.setName("Vivek");
		user.setEmail("vivek@gmail.com");
		//user.setAddress(addr);
		
		return user;
		
		
	}
	
	
}
