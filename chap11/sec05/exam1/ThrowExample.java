package chap11.sec05.exam1;

public class ThrowExample {

	public static void main(String[]args) throws Exception{
		findClass();
		//JVM(Java Virtual Machine)이 최종적으로 예외 처리를 수행하고 예외 내용을 콘솔에 출력함
		
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
