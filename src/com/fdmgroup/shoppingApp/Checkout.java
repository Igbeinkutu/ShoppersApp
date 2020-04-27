package com.fdmgroup.shoppingApp;

import java.math.BigDecimal;
import java.util.Map;
import java.util.logging.Logger;

import com.fdmgroup.exception.EmptyBasketException;
import com.fdmgroup.model.Fruit;
import com.fdmgroup.model.ShoppingCart;

public class Checkout {

	ShoppingCart shoppingCart;
	int quantity;

	public Checkout(ShoppingCart shoppingCart) {
		super();
		this.shoppingCart = shoppingCart;

	}

	public Checkout() {
		super();
	}

	public void addFruitToCart(String fruit) {

		if (shoppingCart.getShoppingCart().containsKey(fruit)) {

			quantity = shoppingCart.getShoppingCart().get(fruit);
			quantity++;
			shoppingCart.getShoppingCart().put(Fruit.getFruit(fruit).getName(), quantity);

		} else {

			shoppingCart.getShoppingCart().put(Fruit.getFruit(fruit).getName(), 1);
		}

	}

	public void doValidations(ShoppingCart cart) {

		if (cart.getShoppingCart().isEmpty()) {

			throw new EmptyBasketException("The Basket is empty");
		}
	}

	public BigDecimal getPrice(String fruitName) {

		BigDecimal price = Fruit.getFruit(fruitName).getPrice().setScale(2, BigDecimal.ROUND_HALF_EVEN);
		return price;
	}

	public BigDecimal getTotalPrice(ShoppingCart fruits) {

		doValidations(fruits);
		BigDecimal totalPrice = BigDecimal.valueOf(0);

		for (Map.Entry<String, Integer> fruit : shoppingCart.getShoppingCart().entrySet()) {

			BigDecimal unit_price;
			BigDecimal unit_price_for_qty;
			BigDecimal quantity =  BigDecimal.valueOf(fruit.getValue());
			
			unit_price = Fruit.getFruit(fruit.getKey()).getPrice();
			unit_price_for_qty = quantity.multiply(unit_price);
			
			totalPrice = totalPrice.add(unit_price_for_qty).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		}

		return totalPrice;
	}

	public void generateBill(ShoppingCart cart) {

		doValidations(cart);
		System.out.println("Item |"+ "Unit Price | " + "Quantity");
		System.out.println("------------------------");
		for (Map.Entry<String, Integer> fruit : shoppingCart.getShoppingCart().entrySet()) {

			BigDecimal price = getPrice(fruit.getKey());
			System.out.println(fruit.getKey() + " | " + price + " | " + fruit.getValue());

		}

		System.out.println("------------------");
		System.out.println("Total Price: " + getTotalPrice(shoppingCart));
	}

}
