package com.gillianbc.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanMaker {

	@Bean(name="yellowfruit")
	public String banana() {
		return "banana";
	}
}
