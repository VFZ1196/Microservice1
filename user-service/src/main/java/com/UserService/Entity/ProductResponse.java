package com.UserService.Entity;

public class ProductResponse {
	
	private User user;
	private Product product;

	public ProductResponse() {
		
	}

	public ProductResponse(User user, Product product) {
		super();
		this.user = user;
		this.product = product;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
