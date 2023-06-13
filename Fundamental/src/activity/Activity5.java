package activity;
//Operator
public class Activity5 {

	public static void main(String[] args) {
		 //Assignment Operator
		int num1,num2;
		num1=24;
		num2=2;
		System.out.println(num1+" "+num2);

		//Arithmetic operator
		double output;
		//Addition operator
		output=num1+num2;
		System.out.println(output);
		
		//subtraction operator
				output=num1-num2;
				System.out.println(output);
				
				//multiplication operator
				output=num1*num2;
				System.out.println(output);
				
				//Division operator
				output=num1/num2;
				System.out.println(output);
				
				//remainder operator
				output=num1%num2;
				System.out.println(output);
				
				//Assignment 
				int j1=10;
				int sum=10;
				//sum =sum+10;
				sum += 10;//compound statemnet answer is sum = 20;
				
				//ternary 
				int n1 =10;
				int n2 =11;
				int res =(n1<n2)?n1:n2;
				System.out.println(res);
	}

}
