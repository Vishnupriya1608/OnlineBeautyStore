package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.onlineBeautyStore.adapterpattern.StorePattern;

public class ProductDetailsTest {

	@Test
	public final void testGetProductDetails() {

		StorePattern st = new StorePattern();

		st.getItems("Vega", "Beauty");
		st.getItems("Loreal", "Hair");
		st.getItems("Lakme", "FaceCream");
		
		assertNotNull(st);
	}

	@Test
	public final void testGetProductDetails1() {
		
		StorePattern st = new StorePattern();

		st.getItems("Vega", "Hair");
		st.getItems("D", "Health");
		assertNotNull(st);
		
	}
	
	@Test
	public final void testGetProductDetails2() {
		
		StorePattern st = new StorePattern();

		st.getItems("1", "Hair");
		assertNotNull(st);

	}

}
