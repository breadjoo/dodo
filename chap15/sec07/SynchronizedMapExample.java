package chap15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {

	public static void main(String[] args) {
		// ThreadA, ThreadB에서 1000개씩 HashMap에 추가한 후 
		
		// Map 컬렉션 생성
		Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
		
		Thread threadA = new Thread() {
			public void run() {
				for(int i=1; i<=1000;i++) {
					map.put(i,  "내용"+i);
				}
			}
		};
		
		Thread threadB = new Thread() {
			public void run () {
				for(int i=1001;i<=2000;i++) {
					map.put(i, "내용"+i);
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {}
		int size = map.size();
		System.out.println(size);
	}

}
