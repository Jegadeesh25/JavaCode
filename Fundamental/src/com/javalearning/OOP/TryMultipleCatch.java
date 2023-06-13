package com.javalearning.OOP;

public class TryMultipleCatch {
	
	public static void doCal(String s) {
		
    try {
			for(int i =0 ; i<=s.length() ; i++) {
				System.out.println(s.charAt(i));	
			}
			
		}catch(ArithmeticException ae){
		System.out.print("Arithmetic exception");
		
		}catch(StringIndexOutOfBoundsException se){
			System.out.print("Static exception");
		
		}catch(Exception e){
			System.out.print("Parent exception");
	}
	
	}

	public static void main(String[] args) {
		TryMultipleCatch.doCal("Java");

	}

}
