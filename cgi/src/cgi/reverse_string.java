package cgi;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter :");
		String str = sc.next();
		
		String s = "";
		char[] arr = str.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			s= s+arr[i];
			
		}
		
		System.out.print(s);
	}

}
