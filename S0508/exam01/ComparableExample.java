package S0508.exam01;

import java.util.TreeSet;

import chap15.sec05.exam04.Fruit;
import chap15.sec05.exam04.FruitComparator;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());
		
		treeSet.add(new Fruit("사과", 5000));
		treeSet.add(new Fruit("딸기", 10000));
		treeSet.add(new Fruit("배", 8000));
		treeSet.add(new Fruit("수박", 15000));
		treeSet.add(new Fruit("무화과", 7000));
		
		for(Fruit fruit : treeSet) {
			System.out.println(fruit.name+"의 값 : " + fruit.price+ "원");
		}
	}

}
