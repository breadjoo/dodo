package S0428.exam01;

import java.util.List;

class Fruit {}
class Banana extends Fruit {}
class Apple extends Fruit {}

class FruitBox <T> {
	List<T> fruits = new ArrayList<>();
	
	public void add(T Fruit) {
		fruits.add(Fruit);
	}
}

