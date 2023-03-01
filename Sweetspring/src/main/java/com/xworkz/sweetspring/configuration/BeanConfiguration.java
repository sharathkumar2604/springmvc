package com.xworkz.sweetspring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
@ComponentScan("com.xworkz")
@EnableWebMvc
public class BeanConfiguration implements WebMvcConfigurer {
	public BeanConfiguration() {
		System.err.println("bean configuration started");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {

	registry.addRedirectViewController("/","home.jsp");
	
	}

}
