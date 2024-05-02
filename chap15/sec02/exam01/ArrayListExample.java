package chap15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//List 컬렉션에서 ArrayList는 가장 많이 사용하는 컬렉션이다.
		//ArrayList는 하나의 객체를 추가하면 내부 배열에 객체가 저장되고 제한 없이 객체를 추가할 수 있음.
		List<Board> list = new ArrayList<>();
		List<Board> list2 = new ArrayList<>();
		//객체 추가
		
		for(int i =0; i<1201; i++) {
			list2.add(new Board("제목",+i+"내용",+i+"글쓴이"+i));
		}
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		//저장된 총 객체 수 읽기
		int size = list.size();
		System.out.println("list1 총 객체 수 : " + size);
		int size2 = list2.size();
		System.out.println("list2 총 객체 수 : " + size2);
		
		Board board = list.get(1);
		System.out.println(board.getSubject()+"\t"+board.getContent()+"\t"+board.getWriter());
		
		Board board2 = list2.get(888);
		System.out.println(board2.getSubject()+board2.getContent()+board2.getWriter());
		
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject()+" "+b.getContent()+" "+b.getWriter());
		}
		System.out.println();
		list.remove(2); // 2번 인덱스를 삭제하면 3번부터 한칸씩 땡겨지고,
		list.remove(2); // 떙겨진것도 또 다시 삭제 할수있다.
		
		
		//향상된 for문 
		for(Board b : list) {
			System.out.println(b.getSubject()+" "+b.getContent()+" "+b.getWriter());
		}
	}

}
