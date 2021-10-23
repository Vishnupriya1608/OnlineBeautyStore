package com.onlineBeautyStore.commandpattern;

public class OrderDetails {

	public static void getOrderDetails() {
		OrderRequest h1 = new OrderRequest("Lakme",4,"Lucy");
		OrderRequest h2 = new OrderRequest("Vega",2,"Kate");
		OrderRequest h3 = new OrderRequest("Loreal",2,"Sony");

		AcceptOrder r1 = new AcceptOrder(h1);
		AcceptOrder r2 = new AcceptOrder(h2);
		AcceptOrder r3 = new AcceptOrder(h3);
		PendingOrder rs1 = new PendingOrder(h1);
		PendingOrder rs2 = new PendingOrder(h2);

		OnlineStore store = new OnlineStore();
		store.takeOrder(r1);
		store.takeOrder(r2);
		store.takeOrder(r3);
		store.takeOrder(rs1);
		store.takeOrder(rs2);

		store.placeOrders();
	   }
}
