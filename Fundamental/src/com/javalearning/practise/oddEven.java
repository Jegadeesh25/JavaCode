package com.javalearning.practise;

import java.util.Scanner;

public class oddEven {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter to Number to verify odd or even : ");
		num = sc.nextInt();

		if(num%2==0) {
			System.out.println(num+ " even number");
		}else {
			System.out.println(num+ " odd number");
		}
	}

}
