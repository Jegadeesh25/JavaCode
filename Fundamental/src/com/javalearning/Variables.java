package com.javalearning;

public class Variables {
	//instance
	int a = 10;
	String name= "Vel";
	static int b=30;
	
	int c;
	static int d;
	
	//function definition for localvariables 
	public void show() {
		int localVariable = 100;
		System.out.println("local"+localVariable);
		
		//int local2;
		//System.out.println(local2);
	}
	
	
	
	
	
public static void main(String[]args) {   //function
	//creating an object
	//syntax
	//classname objName =new classname();
	Variables instanceObj = new Variables();
	
	//Accessing instance variables
	//objName.instanceVariabelName
	
	System.out.println(instanceObj.a);
	System.out.println(instanceObj.name);
	System.out.println("the value of a = "+instanceObj.a);
	
	//calling a function: syntax (print output)
	//objName.functionName
	
	instanceObj.show();
	
	//Accessing static data: using classname
	System.out.println("The static data "+Variables.b);
	
	//Accessing static data: using object
		System.out.println("The static data by object "+ instanceObj.b);
		
		System.out.println(instanceObj.c); //instance
		System.out.println(d); //static
}
}
