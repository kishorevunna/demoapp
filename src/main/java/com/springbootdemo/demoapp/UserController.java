package com.springbootdemo.demoapp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	

	
	@GetMapping("/users")
	public List<User> getUser() {
		
		User user1 = new User();
		user1.setId(1);
		user1.setName("vivek");
		user1.setEmail("vivek@zmazoncom");
		
		User user2 = new User();
		user2.setId(2);
		user2.setName("anand");
		user2.setEmail("anand@amazon.com");
		
		List<User> userList = new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
		return userList;
	}
	
	@GetMapping("/user/{name}")
	public User getUser(@PathVariable String name) {
		
		User user1 = new User();
		user1.setId(1);
		user1.setName("vivek");
		user1.setEmail("vivek@zmazoncom");
		
		User user2 = new User();
		user2.setId(2);
		user2.setName("anand");
		user2.setEmail("anand@amazon.com");
		
		List<User> userList = new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
	
		return userList.stream().filter(temp->temp.getName().equals(name)).collect(Collectors.toList()).get(0);
//		for (User user : userList) {
//			
//			if(user.getName().equalsIgnoreCase(name)) {
//				return user;
//				
//			}
//			
//		}
		
		
		//return null;
	}

	
}
