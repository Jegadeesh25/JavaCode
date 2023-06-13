package Udemy;

import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {
		
		HashMap<String,Integer>map1 = new HashMap<>();
		HashMap<String,Integer>map2 = new HashMap<>();
		
		map1.put("Jagan", 54);
		map2 = map1;
		
		map1.put("Jaga", 45);
		
		System.out.println(map1);
		System.out.println(map2);
	}

}
