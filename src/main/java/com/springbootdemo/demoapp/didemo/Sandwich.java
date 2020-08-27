package com.springbootdemo.demoapp.didemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sandwich {

	
	Catagory catagory;

	
	public Sandwich(Catagory catagory) {
		this.catagory = catagory;
	}
	
	public Catagory getCatagory() {
		return catagory;
	}


	public void setCatagory(Catagory catagory) {
		this.catagory = catagory;
	}
	
	
	
}
