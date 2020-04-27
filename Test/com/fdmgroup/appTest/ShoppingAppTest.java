package com.fdmgroup.appTest;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.fdmgroup.exception.EmptyBasketException;
import com.fdmgroup.model.ShoppingCart;
import com.fdmgroup.shoppingApp.Checkout;

public class ShoppingAppTest {

	private ShoppingCart cart;
	private Checkout checkout;
	
	@Before
	public void init() {
		
		cart = new ShoppingCart();
		checkout = new Checkout(cart);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfOrangeWhenPassedACartContainingTwoOranges() {
	
		cart.getShoppingCart().put("Peach", 2);
		BigDecimal totalprice = checkout.getTotalPrice(cart);
		assertEquals(BigDecimal.valueOf(2.70).setScale(2, BigDecimal.ROUND_HALF_EVEN),  totalprice);
	}

	@Test (expected = EmptyBasketException.class)
	public void test_checkIfCustom_EmptyBasketExceptionIsThrown_WhenCheckoutIsCalledWithEmptyCart() {
		checkout.doValidations(cart);
	}
	
	@Test
	public void test_CheckIfQuantity_isUpdatedWhenSameItem_isAddedThreeTimes() {
		
		checkout.addFruitToCart("Banana");
		checkout.addFruitToCart("Banana");
		checkout.addFruitToCart("Banana");
		
		int quantity = cart.getShoppingCart().get("Banana");
		
		assertEquals(3, quantity);
		
	}
	
	@Ignore("I dont want to check this now")
	@Test
	public void test_SkippedTestMethod() {
		
	}
		
	@After
	public void tearDown() {
		cart.getShoppingCart().clear();
	}
}
