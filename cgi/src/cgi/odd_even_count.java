package cgi;

public class odd_even_count {

	public static void main(String[] args) {
	
		int num = 13123123;
		int even_count= 0;
		int odd_count = 0;

		while(num>0) 
		{
			int r=num%10;
			
			if(r%2==0) {
				even_count++;
			}else {
				odd_count++;
			}
			num=num/10;
			
		}
		System.out.println("even "+even_count+" odd "+odd_count);
		
		}
	
}
