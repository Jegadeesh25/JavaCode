package com.javalearning.OOP;

public class Try_Finally {

	public static void doCal() {
		System.out.println("Enter try block");
		try {
			System.out.println(12/0);
		}finally {
			System.out.println("If exception occurs also finally will occurs");
		}
	}
	public static void main (String [] args) {
		Try_Finally.doCal();
	}
}
