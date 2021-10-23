package com.onlineBeautyStore.facadepattern;

public class Order {

	private Cart lakme;
	private Cart loreal;
	private Cart vega;
	
	public Order() {
		lakme = new Lakme();
		loreal = new Loreal();
		vega = new Vega();
	}
	public void addLakme(){
	      lakme.add();
	   }
	   public void addLoreal(){
	      loreal.add();
	   }
	   public void addVega(){
	      vega.add();
	   }
}
