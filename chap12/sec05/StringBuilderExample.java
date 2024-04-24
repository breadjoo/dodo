package chap12.sec05;

public class StringBuilderExample {

	public static void main(String [] args) {
		String data = new StringBuilder()
				.append("DEF") // 문자열의 끝에 추가
				.insert(0, "ABC") // 문자열을 지정위치에 추가
				.delete(3, 4) //3번 인덱스부터삭제, 4부턴 정상실행 (D 삭제)
				.replace(0, 1, "GGGGG") // 0번 인덱스를 "GGGGG"로 교체
				.toString();
		//StringBulider()클래스에서는 메소드 체이닝 패턴을 사용함
		/* StringBulider가 제공하는 조작 메소드는 StringBulider를 다시리턴하기 때문에
		 * 연이어서 다른 메소드를 호출할 수 있는 메소드 체이닝 패턴을 사용할 수 있음
		 */
		System.out.println(data);
	}
}
