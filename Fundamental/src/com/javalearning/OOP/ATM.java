package com.javalearning.OOP;

import java.util.Scanner;

class PinWrongException extends Exception {
	
}

public class ATM {
	static int count = 1;
	public static void PinVerifier(String pass) {
		if(pass.equals("1234")) {
			System.out.println("Enter the amount");
		}else {
			if(count==3) {
				try {
					throw new PinWrongException() ;
				}catch (PinWrongException pe) {
					System.out.println("Card blocked for 24 hrs");
				}
			}else {
				Scanner sc = new Scanner (System.in);
				System.out.println("Enter the pin again");
				String pin = sc.next();
				count++;
				PinVerifier(pin);
			}
		}
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin...");
		String pin = sc.next();
		ATM.PinVerifier(pin);
	}
}
	

