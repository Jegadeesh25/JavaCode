package cgi;

public class Missing_number {

	public static void main(String[] args) {
		int a[] = {1,2,3,5,6};
		int sum1 = 0;
		int sum = 0;
		for(int i=0; i<a.length;i++) {
			sum1=sum1+a[i];
		}
		int sum2 = 0;
		for(int i=0; i<7;i++) {
			sum2=sum2+i;
		}
		//int sum=0;
		sum = sum2-sum1;
		System.out.print(sum);
	}
	

}
