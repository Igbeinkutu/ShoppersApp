package com.fdmgroup.shoppingApp;


import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Map;

import com.fdmgroup.model.Fruit;
import com.fdmgroup.model.ShoppingCart;

public class MainApp {

	public static void main(String[] args) {

		ShoppingCart shoppingCart = new ShoppingCart();
		//Checkout checkout1 = new Checkout();
		Checkout checkout = new Checkout(shoppingCart);
		
						
		for(String fruit: shoppingCart.getShoppingCart()) {
			
			BigDecimal price = checkout.getPrice(fruit);
			System.out.println(fruit +" "+price);
			
		}
		
		System.out.println("Total Price: "+checkout.getTotalPrice(shoppingCart));
		
	}

}
