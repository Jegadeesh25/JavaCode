package cgi;

import java.util.Random;

public class random_num_stirng {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int num = rand.nextInt(100);
		
		System.out.println(num);
		
		double dbl = rand.nextDouble();
		System.out.println(dbl);
		
		System.out.println(Math.random()); //random is static in Math class
	}

}
