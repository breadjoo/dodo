package chap15.sec06.exam01;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// Stack 컬렉션 생성 (LIFO : Last In First Out 구조)
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(! coinBox.isEmpty()) { //empty 할때까지 반복문 진행 
			Coin coin = coinBox.pop(); // pop()은 스택에서 객체하나 꺼내오기.
			System.out.println(coin.getValue()+"원");
		}
	}

}
