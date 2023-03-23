package com.ToTanKhai.Project.Lab6_1;

public class Product {
	private long id;
	private String name;
	private Double price;
	private String description;
	
	public Product(Product product) {
		this.name = product.name;
		this.id = product.id;
		this.price = product.price;
		this.description = product.description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
