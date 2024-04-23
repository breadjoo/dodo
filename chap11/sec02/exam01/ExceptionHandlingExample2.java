package chap11.sec02.exam01;

public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
		try {
			int result = data.length();
			//data가 null일 경우 NullPointerException 발생
			System.out.println("문자수 : "+ result);
		} catch(NullPointerException error) {
			//System.out.println(error.getMessage());//예외가 발생한 이유만 리턴
			//System.out.println(error.toString());//예외의 종류도 같이 리턴
			error.printStackTrace();//예외가 어디서 발생했는지 추적한 내용까지 리턴
		} finally {
			System.out.println("[마무리 실행]\n");
		}
	}
	
	
	
	public static void main (String [] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("Hello World");
		printLength(null);
		System.out.println("[포르그램 종료]\n");
	}
	
}
