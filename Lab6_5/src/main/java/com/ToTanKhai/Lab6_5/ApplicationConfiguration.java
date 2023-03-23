package com.ToTanKhai.Lab6_5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpat:application.properties")
public class ApplicationConfiguration {

	
	@Value("${name}")
	private String name;
	
	@Value("${id}")
	private String id;
	
	@Value("${preice}")
	private String price;
	
	@Value("${description}")
	private String description;
	
	@Bean
	@Scope("protoype")
	public Product Product1() {
		Product product = new Product(
				Long.valueOf(this.id),
				String.valueOf(this.name),
				Double.valueOf(this.price),
				String.valueOf(this.description)
				
				);
		return product;
	}
	
	public Product Product2() {
		Product product = new Product(
				Long.valueOf(this.id),
				String.valueOf(this.name),
				Double.valueOf(this.price),
				String.valueOf(this.description)
				
				);
		return product;
	}
	
	
	
	
}
