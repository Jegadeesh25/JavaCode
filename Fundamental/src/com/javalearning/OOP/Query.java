package com.javalearning.OOP;

public class Query {
	
	public static int m1() {
		try {
			int r = 12/0;
		}catch (Exception e) {
			System.out.println("inside catch");
			return 2;
		}finally {
			return 3;
		}
	}

	public static void main(String[] args) {
		int result = m1();
		System.out.println(result);

	}

}
