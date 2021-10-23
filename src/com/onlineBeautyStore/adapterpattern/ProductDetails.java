package com.onlineBeautyStore.adapterpattern;

public class ProductDetails {
	
	public static void getProductDetails() {
	
	StorePattern st = new StorePattern();

	st.getItems("Vega", "Beauty");
	st.getItems("Loreal", "Hair");
	st.getItems("Lakme", "FaceCream");
	st.getItems("D", "Health");
	}

}
