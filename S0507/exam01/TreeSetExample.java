package S0507.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(95);
		scores.add(66);
		scores.add(77);
		scores.add(88);
		scores.add(80);
		scores.add(72);
		
		for(Integer s : scores) {
			System.out.print(s);
		}
		System.out.println(scores.first());
		System.out.println(scores.last());
		System.out.println(scores.floor(66));
		System.out.println(scores.ceiling(66));
		System.out.println(scores.higher(86));
		System.out.println(scores.lower(76));
	
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		NavigableSet<Integer> tailSet = scores.tailSet(59,true);
		NavigableSet<Integer> subSet = scores.subSet(77, true, 88, false);
		for(Integer s : descendingSet) {
			System.out.print(s + ",");
		}System.out.println("");
		for(Integer s : tailSet) {
			System.out.print(s + ",");
		}System.out.println("");
		for(Integer s : subSet) {
			System.out.print(s + ",");
		}

	}

}
