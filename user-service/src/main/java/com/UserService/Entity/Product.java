package com.UserService.Entity;

public class Product {
	
	private int prodId;
	private String prodName;
	private String prodType;
	
	public Product() {
		
	}

	public Product(String prodName, String prodType) {
		super();
		this.prodName = prodName;
		this.prodType = prodType;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdType() {
		return prodType;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

}
