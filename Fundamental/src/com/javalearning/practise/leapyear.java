package com.javalearning.practise;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year :");
		year = sc.nextInt();
		
		if(year%4==0 && year%100!=0) {
			System.out.print("leap year");
		}else if(year%400==0) {
			System.out.print("leap year");
		}else {
			System.out.print("not leap year");
		}

	}

}
