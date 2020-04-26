package com.fdmgroup.model;

import java.util.HashMap;

public class ShoppingCart {
	
	HashMap<String, Integer> shoppingCart;

	public ShoppingCart() {
		super();
		shoppingCart = new HashMap<String, Integer>();
	}

	public ShoppingCart(HashMap<String, Integer> shoppingCart) {
		super();
		this.shoppingCart = shoppingCart;
	}

	public HashMap<String, Integer> getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(HashMap<String, Integer> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	

}
