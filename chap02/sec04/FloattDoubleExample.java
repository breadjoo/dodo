package chap02.sec04;

public class FloattDoubleExample {

	public static void main(String[] args) {
		// 정밀도 확인
		
		float var1 = 0.123456789123456789f ;
		float var2 = 0.1123445234443f;
		double var3 = 0.1234567890123456789;
				System.out.println("folat 0.123456789123456789f : " + var1);
				System.out.println("float 0.1123445234443f : " + var2);
				System.out.println("double 0.1234567890123456789; : " + var3);
					
			//1ㅇ0의 거듭제곱 리터럴
		double var4 = 3e6;
		float var5 = 3e6F;
				System.out.println("double 3e6 : " + var4);
				System.out.println("double 3e6f : " + var5);
		double var6 = 2e-3;
				System.out.println("double 2e-3 : " + var6);
	}

}
