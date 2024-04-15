package chap02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
			System.out.printf("상품의 가격:%d원\n", value);
			System.out.printf("상품의 가격:%6d원\n", value); //오른쪽 정렬 (6d에서 6은 6자리수)
			System.out.printf("상품의 가격:%-6d원\n", value); //왼쪽 정렬 
			System.out.printf("상품의 가격:%06d원\n", value); //빈칸을 0으로 채움. 
		double area = 3.141592 * 10 * 10 ;
			System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10,area);
		String name = "유환주";
		String job = "개발자";
			System.out.printf("%6d | %-10s | %10s\n", value, name, job);
			System.out.printf("%3d | %-5s | %4s \n", 77, name , job);
		
	}

}


// 상품의 가격 : %d원 %6d원\n,value
