package activity;

import java.util.Scanner;

class LoginSystem{
	public static void loginCredential(String username, Scanner sc) {
		if(username.equalsIgnoreCase("admin")) {
			System.out.println("Enter your password");
			String password = sc.next();
			if(password.equals("admin")) {
				System.out.println("Welcome");
			}else {
				System.out.println("Invalid password");
			}
		}else {
			System.out.println("Username is wrong");
		}
	}
}
public class login {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your username: ");
	String user =sc.next();
	
	LoginSystem.loginCredential(user, sc);
}
}
