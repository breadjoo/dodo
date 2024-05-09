package S0509.exam01;

import java.util.*;

public class ImmutableExample {
	public static void main (String [] args) {
		
		
		List<String> list1 = List.of("A","B","C","D");
		
		System.out.println(list1);
		
		Set<String> list2 = Set.of("A","B","C","D");
		
		System.out.println(list2);
		
		Map<Integer, String> map1 = Map.of(
				1,"A",
				2,"B",
				3,"C",
				4,"D"
				);
		System.out.println(map1);
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		List<String> copyList1 = List.copyOf(list);
		System.out.println(list);
		System.out.println(copyList1);
		
				
	}

}
