package S0502.exam01;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Board , List, Vector, Thread 이용해서 2가지 array 만들고 size 비교까지 
		
		List<Board> list = new Vector<>();
		
		Thread threadA = new Thread() {
			public void run() {
				for(int i=0;i<1000;i++) {
					list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				}
			}
		};
		
		Thread threadB = new Thread() {
			public void run() {
				for(int i=1000;i<2000;i++) {
					list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				}
			}
		};

		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		}catch (InterruptedException e) {}
		
		int size = list.size();
		System.out.println("총 객체 수 : " +size);
	}

}
