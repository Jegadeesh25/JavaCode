package com.javalearning;

public class String_Methods {

	public static void main(String[]args) {
		//charAt
		String str = "Java";
		char ch = str.charAt(0);
		char ch2 = (char) ((char) ch+32); // A-->65 a-->97
		System.out.println(ch2);
		System.out.println(ch);
		
		//compareTo
		String str2 = "java";
		System.out.println(str.compareTo(str2));
		
		//concat()
		System.out.println(str.concat(str2));
		
		//contains()
		String text = "We are learning Java";
		System.out.println(text.contains("J"));
		
		//endsWith()
		System.out.println(text.endsWith("java"));
		
		//equals:check content of string object
		//== : checks memory location
		String data1 = "Hello";
		String data2 = "Hello";
		System.out.println(data1.equals(data2));
		System.out.println(data1==data2);
		
		String data3 = new String ("Hello");
		String data4 = new String ("Hello");
		System.out.println(data3.equals(data4));
		System.out.println(data3==data4);
		
		System.out.println("Hello".equals("hello"));
		System.out.println("Hello".equalsIgnoreCase("hello"));
		
		//toCarArray()
		String data7 = "Java";
		char[] arr = data7.toCharArray();
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//split
		
		String data8 ="We are learing Java";
		String [] arr2 = data8.split(" "); //condition based 
		for(int i = 0; i<arr2.length;i++) {
			System.out.println(arr2[i]);
		
		
		
		
	}
}
