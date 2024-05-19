package S0519.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(33);
		scores.add(72);
		scores.add(19);
		scores.add(78);
		scores.add(82);
		scores.add(16);
		scores.add(93);
		
		//향상된 포문
		for(Integer s : scores) {
			System.out.println(s);
		}
	System.out.println("----------");
		System.out.println(scores.first());
		System.out.println(scores.higher(55));
		System.out.println(scores.floor(32));
	System.out.println("----------");
		
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		NavigableSet<Integer> tailSet = scores.tailSet(57,true);
		NavigableSet<Integer> subSet = scores.subSet(66, true,88,false);
		for(Integer s : descendingSet) {
			System.out.print(s + ",");
		}System.out.println("");
		for(Integer s : tailSet) {
			System.out.print(s + ",");
		}System.out.println();
		for(Integer s: subSet) {
			System.out.println(s + ",");
		}
		

	}

}
