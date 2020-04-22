package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	List<String> shoppingCart;

	public ShoppingCart() {
		super();
		shoppingCart = new ArrayList<String>();
	}

	public ShoppingCart(List<String> shoppingCart) {
		super();
		this.shoppingCart = shoppingCart;
	}

	public List<String> getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(List<String> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	

}
