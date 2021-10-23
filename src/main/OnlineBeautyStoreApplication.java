package main;

import com.onlineBeautyStore.adapterpattern.ProductDetails;
import com.onlineBeautyStore.commandpattern.OrderDetails;
import com.onlineBeautyStore.facadepattern.AddProducts;
import com.onlineBeautyStore.factorypattern.OnlineStoreFactory;

public class OnlineBeautyStoreApplication {
	
	public static void main(String args[]) {
		
		System.out.println("**********Cart Details**********");
		OnlineStoreFactory.cartDetails();
		
		System.out.println("**********Adding products to the cart**********");
		AddProducts.addProducts();
		
		System.out.println("**********Getting product details from the cart**********");
		ProductDetails.getProductDetails();
		
		System.out.println("**********Getting Order details**********");
		OrderDetails.getOrderDetails();
		
	}

}