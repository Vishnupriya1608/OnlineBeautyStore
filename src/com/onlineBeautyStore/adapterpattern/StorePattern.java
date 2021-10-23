package com.onlineBeautyStore.adapterpattern;

public class StorePattern implements Item{
	CartAdapter ca;
	
	@Override
	public void getItems(String itemname, String Category) {
		if(itemname.equalsIgnoreCase("Vega")){
	         System.out.println("Adding product "+itemname+" in the Category: " + Category);			
	      } 
	      
	      //mediaAdapter is providing support to play other file formats
	      else if(itemname.equalsIgnoreCase("Vega") || itemname.equalsIgnoreCase("Loreal")){
	         ca = new CartAdapter(itemname);
	         ca.getItems(itemname, Category);
	      }
	      
	      else{
	         System.out.println("Invalid product. " + itemname + " not listed in the category "+Category);
	      }
		
	}

}
