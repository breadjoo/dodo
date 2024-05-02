package S0502.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// List board,ArrayList 를 이용해서 array 만들기. 
		// list의  size와 항목별로 getname 하고 remove 사용까지 해보기
		
		List<Board> list = new ArrayList<>();
		
		Thread threadA = new Thread() {
			public void run() {
				for(int i=0;i<1000;i++) {
					list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				}
			}
		};
		
		threadA.start();
		
		try {threadA.join(); }catch (Exception e) {}
		
		int size = list.size();
		System.out.println("총 객체 수 : " +size);
		Board board = list.get(33);
		System.out.println(board.getSubject()+board.getContent()+board.getWriter());
		
		


	}

}
