package com.xworkz.bag.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class DBConfiguration {

	public DBConfiguration() {

		System.out.println("created" + this.getClass().getSimpleName());

	}

	@Bean
	public LocalEntityManagerFactoryBean getEntityManagerFactoryBean() {
		System.out.println("created bean of entity manager");
		LocalEntityManagerFactoryBean emf = new LocalEntityManagerFactoryBean();
		emf.setPersistenceUnitName("bags_properties");
		return emf;

	}

}
