package cgi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList(2,5,6,8,9);
		
		List <Integer> mergelist = Stream.concat(list1.stream(), list2.stream())
				.collect(Collectors.toList());
		
		System.out.println(mergelist);

	}

}