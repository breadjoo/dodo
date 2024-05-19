package S0519.exam01;


import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<String,Integer> treeMap = new TreeMap<>();
		
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 80);
		treeMap.put("base",20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);
		
		
		Set<Entry <String, Integer>> entrySet = treeMap.entrySet();
		for(Entry <String, Integer> e : entrySet) {
			System.out.println(e.getKey()+"-"+e.getValue());
		}System.out.println("~~~~~~~~~~~~~");
		
		Entry<String, Integer> entry = null;
		entry = treeMap.firstEntry();
		System.out.println("first : " + entry);
		System.out.println("first : " + entry.getKey()+"-"+entry.getValue());
		
		NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
		Set<Entry <String, Integer>> desecendingEntrySet = descendingMap.entrySet();
		System.out.println("내림차순 정렬");
		for(Entry <String, Integer> desc : desecendingEntrySet) {
			System.out.println(desc.getKey()+"-"+desc.getValue());
		}
		
		System.out.println("~~~~~~~~~~");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("b", true, "g", false);
		for(Entry<String, Integer> bTog : rangeMap.entrySet()) {
			System.out.println(bTog.getKey()+"-"+bTog.getValue());
		}


	}

}
