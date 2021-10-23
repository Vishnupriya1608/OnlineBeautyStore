package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.onlineBeautyStore.facadepattern.Order;

public class AddProductsTest {

	@Test
	public void testAddProducts() {
		Order o = new Order();

		  o.addLakme();
	      assertNotNull(o);
	     
	}

}
