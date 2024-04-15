package chap02.sec02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		long var3 = 999999999;
		long var4 = 99999999999999L;
		System.out.println(var1 + var2);
		System.out.println(var1 + " + " + var2);
		System.out.println(var3 + " : 1자리수 추가되면 컴파일러가 int로 간주해 에러가 발생 ");
		System.out.println(var4);
		
	}

}
