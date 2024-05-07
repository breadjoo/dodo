package S0507.exam01;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 80);
		treeMap.put("base",20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);
		
		Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
		for(Entry<String,Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}System.out.println("---");
		
		Entry<String, Integer> entry = null;
		entry = treeMap.firstEntry();
		System.out.println("맨앞"  + entry);
		System.out.println("맨앞" + entry.getKey()+"-"+entry.getValue()); 
		
		NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
		Set<Entry<String, Integer>> descendingEntrySet = descendingMap.entrySet();
		System.out.println("내림차순 정렬");
		for(Entry<String, Integer> desc : descendingEntrySet) {
			System.out.print(desc.getKey()+"-"+desc.getValue()+ "//");
		}System.out.println("");	
		System.out.println("c~h까지 ");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c",true,"h",false);
		for(Entry<String, Integer> range : rangeMap.entrySet()) {
			System.out.print(range.getKey()+"-"+range.getValue()+"//");
		}
	}

}
