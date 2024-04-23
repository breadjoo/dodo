package chap11.sec01.exam01;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		String[] array = {"100","1oo"};
		
		for (int i=0;i<=array.length;i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array["+i+"]:"+value);
			} catch(ArrayIndexOutOfBoundsException error) {
				System.out.println("배열의 인덱스가 초과됨:"+ error.getMessage());
				//System.out.println(error.toString());
				//error.printStackTrace();
			} catch(Exception error) { // 상위 예외 클래스는 마지막에 작성
				System.out.println("실행에 문제가 있습니다.");
			}
			/*catch(NumberFormatException error) {
				//숫자 타입이 아닐 때 발상하는 예외처리
				System.out.println("숫자로 변환할 수 없음"+error.getMessage());
			}*/
			
		}

	}

}
