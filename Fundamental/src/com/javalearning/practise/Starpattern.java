package com.javalearning.practise;

public class Starpattern {

	public static void main(String[] args) {
		pattern4(4);

	}
static void pattern4(int n) {
		
		for (int row=1; row<=n; row++) {
			for(int col=1; col<=row; col++) {
				
				System.out.print(col);
				
			}
			System.out.println();
		}
}
static void pattern3(int n) {
		
		for (int row=1; row<=n; row++) {
			for(int col=1; col<=n-row+1; col++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
}
	static void pattern2(int n) {
		
		for (int row=1; row<=n; row++) {
			for(int col=1; col<=row; col++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}

}
