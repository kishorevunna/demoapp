package com.springbootdemo.demoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class User {
	
	private int id;
	private String name;
	private String email;
	
	@Autowired
	private Address addr;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddress(Address addr) {
		this.addr = addr;
	}
	
	

}
