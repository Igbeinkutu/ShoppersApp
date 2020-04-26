package com.fdmgroup.appTest;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.model.Fruit;
import com.fdmgroup.model.ShoppingCart;
import com.fdmgroup.shoppingApp.Checkout;

public class ShoppingAppTest {

	private ShoppingCart cart;
	private Checkout checkout;
	private Fruit orange, banana, lemon;
	
	@Before
	public void init() {
		
		cart = new ShoppingCart();
		checkout = new Checkout(cart);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyCart() {
	
		BigDecimal totalprice = checkout.getTotalPrice(cart);
		assertEquals(BigDecimal.valueOf(20.95),  totalprice);
	}

}
