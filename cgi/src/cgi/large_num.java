package cgi;

public class large_num {

	public static void main(String[] args) {
		
		int a = 435;
		int b = 493;
		int c = 234;
		
		int lar = a>b?a:b;
		lar = lar>c?lar:c;
		System.out.println(lar);

	}

}
