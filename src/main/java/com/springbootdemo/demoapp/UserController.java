package com.springbootdemo.demoapp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	@GetMapping(path = "/user}",produces = "text/html")
	public String getUser(@RequestParam String user) {
		System.out.print(user);
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
	
		//return userList.stream().filter(temp->temp.getName().equals(user)).collect(Collectors.toList()).get(0);
		for (User users : userList) {
			
			if(users.getName().contains(user)) {
				
				return "<h1>ID:"+users.getId()+"</h1>"
						+ "<h1>NAME:"+users.getName()+"</h1>"
						+ "<h1>Email:"+users.getEmail()+"</h1>";
				
			}
			
		}
		
		
		return "<h1>USER NOT FOUND</h1>";
	}

	
}
