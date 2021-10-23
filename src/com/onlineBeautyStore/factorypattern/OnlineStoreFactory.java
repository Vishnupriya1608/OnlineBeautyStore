package com.onlineBeautyStore.factorypattern;

public class OnlineStoreFactory {
	
	public static void cartDetails() {
	      Order brandFactory = new Order();

	      Cart brand1 = brandFactory.getCartDetails("Lakme");

	      brand1.show();

	      Cart brand2 = brandFactory.getCartDetails("Loreal");

	      brand2.show();

	      Cart brand3 = brandFactory.getCartDetails("Vega");

	      brand3.show();
	   }


}
