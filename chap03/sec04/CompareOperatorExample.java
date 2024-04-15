package chap03.sec04;

public class CompareOperatorExample {

	public static void main(String[] args) {
			int num1 = 10;
			int num2 = 11;
		boolean result1 =(num1 == num2);
		boolean result2 =(num1 != num2);
		boolean result3 =(num1 <= num2);
		boolean result4 =(num1 > num2);
		boolean result5 =(num1 < num2);
				System.out.println("result1 : " + result1);
				System.out.println("result2 : " + result2);
				System.out.println("result3 : " + result3);
				System.out.println("result4 : " + result4);
				System.out.println("result5 : " + result5);
				System.out.println("--------------------------");
				
			char char1 = 'A'; // 65
			char char2 = 'B'; // 66
		boolean resultA = (char1 <char2);
				System.out.println("resultA : " + resultA);
				System.out.println("--------------------------");
				
			int num3 = 1;
			double num4 = 1.0;
		boolean rresult1 = (num3 == num4);
				System.out.println("rresult1 : " + rresult1 + "//정수(int)와 실수(double)의 값이 같을 수 있음.");
				
			float num5 = 0.1f;
			double num6 = 0.1;
		boolean rresult2 = (num5 == num6);
				System.out.println("rresult2 : " + rresult2 + "// float은 0.0000000x가 있어서 다름.");
		boolean rresult3 = (num5 == (float)num6);
				System.out.println("rresult3 : " + rresult3);
				System.out.println("--------------------------");
				
			String str1 = "자바";
			String str2 = "Java";
		boolean result8 = (str1.equals(str2)); // equals : 같은지 == (문자열 비교시 사용)
				System.out.println("result8 : " + result8);
		boolean result9 = (! str1.equals(str2)); // ! : 부정
				System.out.println("result9 : " + result9);
			
		
	}

}
