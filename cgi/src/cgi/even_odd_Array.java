package cgi;

public class even_odd_Array {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6,7};
		int even = 0;
		int odd = 0;
		
		for(int i:a)
		{
			if(i%2==0) 
			{
				System.out.print("even"+" "+i);
			}
			else 
			{
				System.out.println("odd"+" "+i);
			}
		}

	}

}
