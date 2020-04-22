package com.fdmgroup.shoppingApp;

import com.fdmgroup.model.ShoppingCart;

public class MainApp {

	public static void main(String[] args) {

		ShoppingCart shoppingCart = new ShoppingCart();
		Checkout checkout = new Checkout();
		
		shoppingCart.getShoppingCart().put("Orange", 2);
		shoppingCart.getShoppingCart().put("Banana", 4);
		shoppingCart.getShoppingCart().put("Apple", 5);
		shoppingCart.getShoppingCart().put("Lemon", 1);
		shoppingCart.getShoppingCart().put("Peach", 3);
		
		checkout.getPrice("Orange");
		
		System.out.println(checkout.getPrice("Orange"));
		
		
		
		
	}

}
