package com.springbootdemo.demoapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter{

	@Bean
	public InternalResourceViewResolver irv() {
		
		InternalResourceViewResolver irv = new InternalResourceViewResolver();
		irv.setPrefix("/");
		irv.setSuffix(".html");
		return irv;
	 
		
	}
}

