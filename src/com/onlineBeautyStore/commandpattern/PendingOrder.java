package com.onlineBeautyStore.commandpattern;

public class PendingOrder implements Order{
	OrderRequest or;
	
	public PendingOrder(OrderRequest or) {
		this.or = or;
	}
	@Override
	public void deliver() {
		
		or.pending();
	}

}
