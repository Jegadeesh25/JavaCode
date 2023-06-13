package cgi;

public class Max_min {

	public static void main(String[] args) {
		int a[] = { 324,345,756,243,546};
		int max = a[0];
		
		for(int i = 0 ; i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
				
			}
			
		}
		System.out.println(max);
	}

}
