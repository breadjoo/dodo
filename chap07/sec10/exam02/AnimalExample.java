package chap07.sec10.exam02;

public class AnimalExample {

	public static void main(String[] args) {

		//Animal animal = new Animal(); (추상은 new 사용 불가)
		Dog dog = new Dog();
		Lion lion = new Lion();
		Cat cat = new Cat();
				
		dog.sound();
		cat.sound();
		lion.sound();
		dog.live();
		
	}

}
