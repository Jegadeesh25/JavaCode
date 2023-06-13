package com.javalearning.OOP;

class A{
	   int a = 20;
		public final void show(){
			System.out.println("Hello from A");
		}
	}

	class B extends A{
//		public void show(){
//			
//		}
	}

	public class Final {

		public static void main(String[] args) {
			B b = new B();
			//b.a = 200;

		}
	}
