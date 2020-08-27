package com.springbootdemo.demoapp;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String city;
	private String Country;
	private String zipcode;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
	
	
	
	

}
