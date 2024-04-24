package S0424.exam01;


public class StringBuilder {

	public static void main(String [] args) {
		String data = new StringBuilder()
				.append("DEF") // 문자열의 끝에 추가
				.insert(0, "ABC") // 문자열을 지정위치에 추가
				.delete(3, 4) //3번 인덱스부터삭제, 4부턴 정상실행 (D 삭제)
				.replace(0, 1, "GGGGG") // 0번 인덱스를 "GGGGG"로 교체
				.toString();
		System.out.println(data);
	}
}
