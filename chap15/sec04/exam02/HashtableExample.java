package chap15.sec04.exam02;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

	public static void main(String[] args) {
		// Hashtable 컬렉션 생성
		Map<String, Integer> map = new Hashtable<>();
		
		//작업 스레드 객체 생성
		Thread threadA = new Thread() {
			public void run() {
				for (int i=1;i<=1000;i++) {
					map.put(String.valueOf(i),i);
				}
			}
		};
		
		Thread threadB = new Thread() {
			public void run() {
				for (int i=1001;i<=2000;i++) {
					map.put(String.valueOf(i),i);
				}
			}
		};
		threadA.start();
		threadB.start();
		try {
			threadA.join();
			threadB.join();
		}catch(Exception e) {};
		
		int size = map.size();
		System.out.println("총 엔트리 수 : " +size);
		

	}

}
