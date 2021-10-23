package com.onlineBeautyStore.factorypattern;

public class Order {

	public Cart getCartDetails(String product){
	      if(product == null){
	         return null;
	      }		
	      if(product.equalsIgnoreCase("Lakme")){
	         return new Lakme();
	         
	      } else if(product.equalsIgnoreCase("Loreal")){
	         return new Loreal();
	         
	      } else if(product.equalsIgnoreCase("Vega")){
	         return new Vega();
	      }
	      
	      return null;
	   }
}
