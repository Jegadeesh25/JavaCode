package com.javalearning.practise;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[]args) {
	
		int num,i,count=0;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number : ");
		num = sc.nextInt();
		
		for(i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				//break;
			}
		}
		if(count==0) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
		
	}
	}
