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
		
		shoppingCart.getShoppingCart().add(Fruit.ORANGE.getName());
		shoppingCart.getShoppingCart().add(Fruit.BANANA.getName());
		shoppingCart.getShoppingCart().add(Fruit.LEMON.getName());
		shoppingCart.getShoppingCart().add(Fruit.PEACH.getName());
		shoppingCart.getShoppingCart().add(Fruit.APPLE.getName());
		shoppingCart.getShoppingCart().add(Fruit.APPLE.getName());
		shoppingCart.getShoppingCart().add(Fruit.APPLE.getName());
	}

	public Checkout() {
		super();
	}
	

	public void doValidations(ShoppingCart cart) {
		
		if(cart.getShoppingCart() == null) {
			
			System.out.println("Shopping Cart is Empty");
			throw new NullPointerException("The Basket is empty");
		}	
	}
	
	public BigDecimal getPrice(String fruitName) {
		
		BigDecimal price = Fruit.getFruit(fruitName).getPrice().setScale(2, BigDecimal.ROUND_HALF_EVEN);
		return price;
	}
	
	public BigDecimal getTotalPrice(ShoppingCart fruits) {
		
		doValidations(fruits);
		Fruit.getFruit("Orange").getPrice();
		BigDecimal totalPrice = BigDecimal.valueOf(0);
		
		for(String fruit: shoppingCart.getShoppingCart()) {
			
			BigDecimal price; 			
			price = Fruit.getFruit(fruit).getPrice(); 
			totalPrice = totalPrice.add(price).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		}
		
		return totalPrice;
	}

}
