package com.fdmgroup.model;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	
	Map<String, Integer> shoppingCart;

	public ShoppingCart() {
		super();
		shoppingCart = new HashMap<String, Integer>();
	}

	public ShoppingCart(Map<String, Integer> shoppingCart) {
		super();
		this.shoppingCart = shoppingCart;
	}

	public Map<String, Integer> getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(Map<String, Integer> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	

}
