package com.fdmgroup.appTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fdmgroup.model.Fruit;

public class FruitTest {

	@Test (expected = IllegalArgumentException.class)
	public void test_checkIfGetFruitMethod_throwsAnExceptionWhen_aFruitThat_doesNotExistIsPassed() {
		
		Fruit.getFruit("range");
	}

}
