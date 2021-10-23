package com.onlineBeautyStore.adapterpattern;

public class AddToCart implements Cart {

	@Override
	public void addToCart(String itemname) {
		System.out.println(itemname+" added to the cart");

	}

	@Override
	public void showCart(String itemname) {
		// TODO Auto-generated method stub

	}

}
