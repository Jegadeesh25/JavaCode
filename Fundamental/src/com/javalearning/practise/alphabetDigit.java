package com.javalearning.practise;

import java.util.Scanner;

public class alphabetDigit {

	public static void main(String []args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character :");
		ch = sc.next().charAt(0);
		
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
			System.out.println("\n The character \'" +ch+ "\' is an Alphabet");
		}else if(ch>='0' && ch<='9') {
			System.out.println("\n The character \'" +ch+ "\' is an digit");
		}else {
			System.out.println("\n The character \'" +ch+ "\' is neither an Alphabet nor digit");
		}
	}
}
