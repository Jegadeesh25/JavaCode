package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class SimpleListIntro {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
			
		list.add(12);
		list.add(45);
		list.add(1, 27);
		System.out.println(list);
		
		list.remove(0);

		System.out.println(list);
		
		List<Integer>list2 = new ArrayList<>();
		list2.add(33);
		
		list.addAll(list2);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list2);
		
	}
	

}
