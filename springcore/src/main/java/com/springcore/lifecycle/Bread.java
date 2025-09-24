package com.springcore.lifecycle;

public class Bread {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Bread() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bread [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init Method");
	}
	public void destory() {
		System.out.println("Inside destory Method");
	}

}
