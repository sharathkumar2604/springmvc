package com.xworkz.pens.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan("com.xworkz.pens")
@EnableWebMvc


public class BeanConfiguration implements WebMvcConfigurer {

	public BeanConfiguration() {
		System.out.println("created"+this.getClass().getSimpleName());
	
	}
	
	
	public ViewResolver viewResolver()
	{
		return new InternalResourceViewResolver("/",".jsp");
	}
	
	public void addViewControllers(ViewControllerRegistry registry)
	{
		registry.addRedirectViewController("/","Home.jsp");
	}

	
	
}
