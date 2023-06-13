package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<>();
		map.put(1, "Nila1");
		map.put(2, "Nila2");
		map.put(3, "Nila3");
		
		System.out.println(map);
		
		//Traversing Map:
		for(Map.Entry<Integer, String> data:map.entrySet()) {
			System.out.println(data.getKey()+ " "+ data.getValue());
		}
		//
			System.out.println(map.get(map));
	}

}
