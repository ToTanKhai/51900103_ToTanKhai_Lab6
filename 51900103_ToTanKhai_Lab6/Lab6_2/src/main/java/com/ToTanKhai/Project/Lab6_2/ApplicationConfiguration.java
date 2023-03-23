package com.ToTanKhai.Project.Lab6_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfiguration {
	@Bean
	@Scope("prototype")
	public Product Product1() {
		Product product = new Product(1, "Iphone", 2000, "A great phone");
		return product;
	}
	@Bean
	@Scope("prototype")
	public Product Product2() {return new Product(Product1());}
	
	@Bean
	@Scope("prototype")
	public Product Product3() {
		Product product = new Product(3, "Iphone2", 3000, "A great phone");
		return product;
	}

}
