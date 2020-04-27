package com.fdmgroup.shoppingApp;


import java.math.BigDecimal;
import java.util.Map;

import com.fdmgroup.model.ShoppingCart;

public class MainApp {

	public static void main(String[] args) {

		ShoppingCart shoppingCart = new ShoppingCart();
		//Checkout checkout1 = new Checkout();
		Checkout checkout = new Checkout(shoppingCart);
		
		//add items to cart
		checkout.addFruitToCart("Orange");
		checkout.addFruitToCart("Banana");
		checkout.addFruitToCart("Lemon");
		checkout.addFruitToCart("Lemon");
		checkout.addFruitToCart("Peach");
		checkout.addFruitToCart("Peach");
		checkout.addFruitToCart("Peach");
		checkout.addFruitToCart("Apple");
		checkout.addFruitToCart("Apple");
		
		checkout.generateBill(shoppingCart);
		
	}

}
