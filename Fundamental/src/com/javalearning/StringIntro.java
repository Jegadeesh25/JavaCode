package com.javalearning;

public class StringIntro {

	public static void main(String[] args) {
		//String are immutable
		String str ="Java";
		System.out.println(str);
		str.concat("language");
		System.out.println(str);
		//reassignment = while reassignment a new object will create
		str = str.concat("language");
		System.out.println(str);
		

	}

}
