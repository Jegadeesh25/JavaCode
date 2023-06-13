package com.javalearning.OOP;

class Animal{
	int id = 1;
	
	public int id() {
		return this.id;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		int p = a1.id();
		System.out.println(p);
	}

}
