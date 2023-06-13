package com.javalearning.practise;

import java.util.Scanner;

public class addTwoNumbers {

	public static void main(String[] args) {
		int firstNumber,secondNumber,add;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		firstNumber = sc.nextInt();
		
		System.out.print("Enter second number: ");
		secondNumber = sc.nextInt();
		
		add = firstNumber+secondNumber;
		System.out.println("Result = "+add);

	}

}
