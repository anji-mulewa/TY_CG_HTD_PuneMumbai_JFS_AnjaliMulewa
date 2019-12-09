package com.capgemini.springcore.beans;

public class MobileBean {
	private String brandName;
	private String modelName;
	private double price;
	private MobileDisplayBean mobiledisp;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public MobileDisplayBean getMobiledisp() {
		return mobiledisp;
	}

	public void setMobiledisp(MobileDisplayBean mobiledisp) {
		this.mobiledisp = mobiledisp;
	}

}
