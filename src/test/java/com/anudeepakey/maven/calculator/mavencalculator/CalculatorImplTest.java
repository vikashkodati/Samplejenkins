package com.anudeepakey.maven.calculator.mavencalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorImplTest {

	@Test
	public void AddShouldReturnResult() {
		Calculator c = new CalculatorImpl();
		int result = c.add(10,20);
		assertEquals(30,result);
	}

}
