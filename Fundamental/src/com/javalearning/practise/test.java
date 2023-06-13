package com.javalearning.practise;

public class test {

	public static void main(String[] args) {
		//remove the duplicate 
		
		String str = "Java";
		
		char [] s = str.toCharArray();
		String a ="";
		
		for(int i=0; i<s.length-1; i++) {
			
			if(s.equals(s[i]))
			
			{
				System.out.print(s);
			}
		}

	}

}
