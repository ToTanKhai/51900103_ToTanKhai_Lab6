package com.ToTanKhai.Lab6_5;

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
	

	public Product(long id, String name, Double price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
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
