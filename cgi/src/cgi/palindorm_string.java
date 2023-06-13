package cgi;

import java.util.Scanner;

public class palindorm_string {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		
		String str = sc.next();
		String rev ="";
		char[]arr = str.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			rev= rev+arr[i];
		}
		if(str.equals(rev)) {
		System.out.print(rev+" palindrome");
	}else
	{
		System.out.print(rev+" not palindrome");
	}
		
	}

}
