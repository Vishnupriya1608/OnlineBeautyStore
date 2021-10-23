package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.onlineBeautyStore.commandpattern.AcceptOrder;
import com.onlineBeautyStore.commandpattern.OnlineStore;
import com.onlineBeautyStore.commandpattern.OrderRequest;
import com.onlineBeautyStore.commandpattern.PendingOrder;

public class OrderDetailsTest {

		@Test
		public final void test() {
			OrderRequest o1 = new OrderRequest("Lakme",4,"Lucy");
			
			AcceptOrder ao1 = new AcceptOrder(o1);
			
			PendingOrder po1 = new PendingOrder(o1);
			

			OnlineStore store = new OnlineStore();
			store.takeOrder(ao1);
			store.takeOrder(po1);

			store.placeOrders();
			assertNotNull(store);
		}
		@Test
		public final void test1() {
			
			OrderRequest o1 = new OrderRequest("Vega",2,"Kate");
			OrderRequest o2 = new OrderRequest("Loreal",2,"Sony");

			AcceptOrder ao1 = new AcceptOrder(o1);
			AcceptOrder ao2 = new AcceptOrder(o2);
			
			PendingOrder po1 = new PendingOrder(o1);

			OnlineStore store = new OnlineStore();
			store.takeOrder(ao1);
			store.takeOrder(ao2);
			store.takeOrder(po1);

			store.placeOrders();
			assertNotNull(store);
		}
		

}
