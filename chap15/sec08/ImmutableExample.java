package chap15.sec08;

import java.util.*;

public class ImmutableExample {

	public static void main(String[] args) {
		// 불변 컬렉션 생성 : List, Set, Map 의 정적메소드인 of()로 생성함
		// List 불변 컬렉션 생성
		
		List<String> immutableList = List.of("A","B","C","D"); 
		//immutableList.add("E");
		//immutableList.remove("C");
		System.out.println("immutableList : "+immutableList);

		//Set 불변 컬렉션 생성
		Set<String> immutableSet = Set.of("A","B","C","D");
		//immutableSet.add("E");
		//immutableSet.remove("A");
		System.out.println("immutableMap : " + immutableSet);
		
		//Map 불변 컬렉션 생성
		Map<Integer, String> immutableMap = Map.of(
				1,"A",
				2,"B",
				3,"C",
				4,"D"
				);
		//immutableMap.put(5, "E");
		//immutableMap.remove(1);
		System.out.println("imuutableMap : "+immutableMap);
		
		//List 컬렉션을 불변 컬렉션으로 복사
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		List<String> immutableList2 = List.copyOf(list);
		System.out.println("list : "+ list);
		//immutableList2.add("E");
		System.out.println("immutalbelist2 : "+ immutableList2);
		
		
		//Set 컬렉션을 불변 컬렉션으로 복사
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		Set<String> immutableSet2 = Set.copyOf(set);
		System.out.println("set : " + set);
		//immutableSet2.remove("A");
		System.out.println("immutableSet2 : " + immutableSet2);
		
		//Map 컬렉션을 불변 컬렉션으로 복사
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		Map<Integer,String> immutableMap2 = Map.copyOf(map);
		System.out.println("Map : " + map);
		//immutableMap2.remove(1,"A");
		System.out.println("immutableMap2 : " +immutableMap);
		
		
		//배열로 부터 List 불변 켈렉션 생성
		String [] arr = { "A","B","C","D"} ;
		List<String> immutableList3 = Arrays.asList(arr);
		System.out.println("arr : " +arr);
		System.out.println("immutableList3 : " + immutableList3);
	}

}
