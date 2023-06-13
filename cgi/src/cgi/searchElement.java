package cgi;

public class searchElement {

	public static void main(String[] args) {
		
		int a[] = {23,5234,324,2353,235};
		int s = 235;
		boolean flag=false;
		for(int i=0; i<a.length;i++)
		{
			if(s==a[i])
			{
				System.out.println("found "+a[i]);
				flag=true;
				//break;
			}
		}
		if(flag==false)
			System.out.println("not found");

	}

}
