package activity;

public class Activity9 {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("Cooking");
		str.append("Emerging");
		System.out.println(str);
		
		str.insert(1,"Techology");
		System.out.println(str);

		str.replace(2,5,"loT");
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		
		System.out.println(str.capacity());
	}

}
