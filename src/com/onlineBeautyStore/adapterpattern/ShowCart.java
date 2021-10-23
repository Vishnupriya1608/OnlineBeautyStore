package com.onlineBeautyStore.adapterpattern;

public class ShowCart implements Cart {

	@Override
	public void addToCart(String itemname) {
		// TODO Auto-generated method stub

	}

	@Override
	public void showCart(String itemname) {
		System.out.println("Cart contains the item "+itemname);

	}

}
