package com.onlineBeautyStore.commandpattern;

public class OrderRequest {

	private String productName;
	private int quantity;
	private String customerName;
	
	
	
	public OrderRequest(String productName, int quantity, String customerName) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.customerName = customerName;
	}
	public void accept() {
		System.out.println("Thank you "+customerName+ " for ordering "+quantity+" Units of porduct "+productName);
	}
	public void pending() {
		System.out.println("Dear "+customerName+" "+quantity+" units of product "+productName+" is still pending in the cart. Proceed with the order.");
	}
}
