package com.xworkz.bag.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.bag")
@EnableWebMvc
public class BeanConfiguration implements WebMvcConfigurer {

	public BeanConfiguration() {
		System.out.println("created" + this.getClass().getSimpleName());

	}

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "Home.jsp");
	}

	@Bean
	public ViewResolver viewResolver() {
		return new InternalResourceViewResolver("/", ".jsp");

	}

}
