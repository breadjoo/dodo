package cahp05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		String board = "1,자바 학습,매머드커피,참조 타입 String을 학습합니다.,아이폰,Starbucks";
		//문자열 분리하기 ~_~ !
		String[] tokens = board.split(",");
		//인덱스*로 읽기	
			System.out.println("번호 : "+tokens[0]);
			System.out.println("제목 : "+tokens[1]);
			System.out.println("주제 : "+tokens[2]);
			System.out.println("내용 : "+tokens[3]);
			System.out.println("핸드폰 : "+tokens[4]);
			System.out.println();
			
			// for 문을 이용한 읽기
		for(int i=0;i<tokens.length;i++) {
			System.out.println(tokens[i]);
		}

	}

}
