package com.javalearning.OOP;

public class ExceptionIntro {
	
	public static void doCalculation() {
		try {
			
			System.out.println(12/0);
			
		} catch (ArithmeticException ae){
			System.out.println("End");
		}finally {
			System.out.println("Inside finally block");	
		}
		
		}

	public static void main(String[] args) {
		ExceptionIntro.doCalculation();

	}

}
