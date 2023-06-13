package cgi;

public class sumOfArray {

	public static void main(String[] args) {
		int a[]= {32,423,234,534};
		int sum=0;
		for(int i=0; i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum);
	}

}
