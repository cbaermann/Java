package com.calculator.test;

import com.calculator.Calc;

public class CalcTest {
	private static void main(String[] args) {
		Calc c = new Calc(10.5, "+", 5.2);
		
		c.performOperation();
		c.retrieveResults();
		
		
		
		
	}
}
