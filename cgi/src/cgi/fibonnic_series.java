package cgi;

public class fibonnic_series {

	public static void main(String[] args) {
		int a= 0 ;
		int b= 1;
		int sum =0;
		
		for(int i =2; i<20; i++)
		{
			sum = a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}

	}

}
