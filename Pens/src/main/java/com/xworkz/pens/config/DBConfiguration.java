package com.xworkz.pens.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class DBConfiguration {

	public DBConfiguration() {

	System.out.println("created"+this.getClass().getSimpleName());
	
	}
	@Bean
	public LocalEntityManagerFactoryBean getEntityManager() {
		System.out.println("created bean of entitymanager");
		LocalEntityManagerFactoryBean emf=new LocalEntityManagerFactoryBean();
		emf.setPersistenceUnitName("");
		
		
		
		return null;
		
	}
	


	
	
	
}
