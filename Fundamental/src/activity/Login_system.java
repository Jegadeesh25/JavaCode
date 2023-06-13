package activity;
import java.util.Scanner;

public class Login_system {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Username: ");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("your are eligible");
		}else {
			
		}
	}

}
