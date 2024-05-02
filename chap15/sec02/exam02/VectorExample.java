package chap15.sec02.exam02;

import java.util.List;
import java.util.Vector;

import chap15.sec02.exam01.Board;

public class VectorExample {
	public static void main (String[]args) {
		List<Board> list = new Vector<>();
		Thread threadA = new Thread() {
			
			public void run() {
				for(int i =1;i<=1000;i++) {
					list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				}
			}
		};
		
		Thread threadB = new Thread() {
			
			public void run() {
				for(int i=1001;i<=2000;i++) {
					list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				}
			}
		};
		
		threadA.start();
		threadB.start();

		//join : 작업 스레드들이 끝날때 까지 메인스레드를 기다리게 함
		try {
			threadA.join();
			threadB.join();
		} catch(Exception e) {}
		
		int size = list.size();
		System.out.println("총 객체 수 " + size);
		 
	}

}
