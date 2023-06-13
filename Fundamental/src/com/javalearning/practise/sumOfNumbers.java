package com.javalearning.practise;

import java.util.Scanner;

public class sumOfNumbers {

	public static void main(String[] args) {
		int n,num,sum =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of n :");
		n = sc.nextInt();
		System.out.print("Enter "+n+" Numbers:");
		for(int i=0;i<n;i++) {
			num = sc.nextInt();
			sum=sum+num;
		}
		System.out.print("Sum = "+sum);
	}

}
