package com.javalearning.practise;

public class CapitalLetter {

	public static void main(String[] args) {
		String str = "java is the programming language";
		String [] words = str.split(" ");
		String s = "";
		
		for(String a:words) {
			s = s+a.toUpperCase().charAt(0)+a.substring(1)+" ";
		}
		System.out.println(s);
		
	}
}
