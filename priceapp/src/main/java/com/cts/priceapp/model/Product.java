package com.cts.priceapp.model;

import javax.validation.constraints.NotNull;

public class Product {

	@NotNull
	private double productPrice;
	@NotNull
	private String productType;
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
}
