package cgi;

import java.util.Scanner;

public class prime_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter value");
		int num = sc.nextInt();
		int count = 0;
		if(num>0) 
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i==0) 
				{
					count++;
					
				}
			}if(count==2) 
				{
					System.out.println("It is prime");	
				}
				else
				{
					System.out.println("not prime")	;
				}
			
		}
		else
		{
		System.out.println("Not prime");	
		}

	}

}
