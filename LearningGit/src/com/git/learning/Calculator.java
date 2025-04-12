package com.git.learning;

public class Calculator {

	public int add(int i, int j) {
		int result = 0 ;
		result = i + j;
		return result;
	}

	public int multiply(int i, int j) {
		return i * j;
	}
	
	public int divide(int x, int y) {
		if(y!= 0) { 
			result = x/y;		
		} else {
			throw new Exception("You cant divide number by Zero");
			
		}
	}
}
 