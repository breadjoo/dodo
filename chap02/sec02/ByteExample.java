package chap02.sec02;

public class ByteExample {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = -77;
		byte var4 = 0;
		byte var5 = 123;
		// byte var6 = 128;  // 컴파일 에러 발생 byte 타입 변수의 허용범위 초과 (-128~127)
		System.out.println("1번 : " + var1);
		System.out.println("2번 : " + var2);
		System.out.println("3번 : " + var3);
		System.out.println("4번 : " + var4);
		System.out.println("5번 : " + var5);
		System.out.println("6번 : var6 = 에러");
		
	

	}

}
