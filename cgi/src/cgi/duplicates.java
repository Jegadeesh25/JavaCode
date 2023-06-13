package cgi;

public class duplicates {

	public static void main(String[] args) {
		int a[]= {1,3,4,5,6,3,4};
		boolean flag=false;
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]==a[j])
				
					System.out.println("duplicates :"+a[j]);
					flag=true;
				
			}
			if(flag==false)
				System.out.println("no duplicates");
		}
	}

}
