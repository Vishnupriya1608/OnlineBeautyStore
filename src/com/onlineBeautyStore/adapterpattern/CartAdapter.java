package com.onlineBeautyStore.adapterpattern;

public class CartAdapter implements Item{

	Cart cart;
	
	public CartAdapter(String itemname) {
		if(itemname.equalsIgnoreCase("Vega")) {
			cart = new AddToCart();
		}else if(itemname.equalsIgnoreCase("Loreal")) {
			cart = new ShowCart();
		}
	}
	
	@Override
	public void getItems(String itemname, String Category) {
		
		if(itemname.equalsIgnoreCase("Vega")) {
			cart.addToCart(Category);
		}else if(itemname.equalsIgnoreCase("Loreal")) {
			cart.showCart(Category);
		}
		
	}

	
}
