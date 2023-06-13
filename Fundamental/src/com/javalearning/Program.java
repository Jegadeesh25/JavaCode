package com.javalearning;

public class Program {

	public static void LowerCase(String str) {
		String s1 = "";
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			int data =ch+32;
			s1 =s1+(char)data;
			
		}
		System.out.println(s1);
	}
	public static void main (String[] args) {
		String str = "JAVA";
		LowerCase(str); //calling static function
		
	}
}
