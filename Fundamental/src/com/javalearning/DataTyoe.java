package com.javalearning;

public class DataTyoe {
	public static void main(String[]args) {
		byte a= 10;
		short b =20;
		int c =30;
		long d= 401;
		float e =56.78f;
		double g = 45.678;
		
		System.out.println(a);
		
		//TypeCasting:
		//implicit
		byte a1 =20;
		int b1=a1;
		System.out.println(b1);
		//Explicit
		int data3 =20;
		byte data4=(byte)data3;
		System.out.println(data4);
		
		char ch ='a';
		int data6= ch;
		System.out.println(data6);
	}

}
