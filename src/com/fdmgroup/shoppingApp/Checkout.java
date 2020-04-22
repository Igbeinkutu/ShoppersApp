package com.fdmgroup.shoppingApp;

import java.math.BigDecimal;
import java.util.Map;

import com.fdmgroup.model.Fruit;
import com.fdmgroup.model.ShoppingCart;

public class Checkout {
	
	ShoppingCart shoppingCart;
	
	public Checkout(ShoppingCart shoppingCart) {
		super();
		this.shoppingCart = shoppingCart;
	}

	public Checkout() {
		super();

	}

	public void doValidations(ShoppingCart cart) {
		
		if(cart.getShoppingCart() == null) {
			
			System.out.println("Shopping Cart is Empty");	
		}	
	}
	
	public BigDecimal getPrice(String fruitName) {
		
		BigDecimal price = Fruit.getFruit("fruitName").getPrice().setScale(2, BigDecimal.ROUND_HALF_EVEN);
		return price;
	}
	
//	public BigDecimal getTotalPrice(ShoppingCart fruits) {
//		
//		
//		fruits.getShoppingCart().put(key, value)
//		for(BigDecimal price: fruits.)
//		return ;
//	}

}
