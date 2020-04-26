package com.fdmgroup.model;

import java.math.BigDecimal;

public enum Fruit {
	
	APPLE("Apple", BigDecimal.valueOf(5.20)),
	BANANA("Banana", BigDecimal.valueOf(1.30)),
	LEMON("Lemon", BigDecimal.valueOf(1.40)),
	ORANGE("Orange", BigDecimal.valueOf(1.30)),
	PEACH("Peach", BigDecimal.valueOf(1.35));
	
	private String name;
	private BigDecimal price;

	Fruit(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
   public static Fruit getFruit(String name) {
        for (Fruit fruit : Fruit.values()) {
            if (fruit.name.equalsIgnoreCase(name)) {
                return fruit;
            }
        }
       throw new IllegalArgumentException("No Fruit with name " + name + " found");
    }
	
}
