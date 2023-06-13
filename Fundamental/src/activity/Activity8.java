package activity;
//String
public class Activity8 {

	public static void main(String[] args) {
		//String declaration
		String a="Cooking";
		System.out.println(a);
		
		//String declaration using new operator
		String b=new String("loT");
		System.out.println(b);

		//other string method
		
		System.out.println(a.length());
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a + b );
		System.out.println(a.concat(b));
		System.out.println(a.charAt(5));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.compareTo(b));
		System.out.println(a.contains("X"));



	}

}
