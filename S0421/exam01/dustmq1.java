package S0421.exam01;

public class dustmq1 {
	public static void main(String [] args) {
		int i = 1;
		while (i<=20) {
			System.out.println(i);
			i++;			
		} while (i <=30) {
			i++;
		}
		System.out.println(i); 
		
		int x = 1;
		int sum = 0;
		while (x <=100) {
			x++;
			sum +=x;	
		}
		System.out.println(sum);
		/* while문 복습
		 * i초기값을 주고, while (i<10) 등의 예시를 넣어준 후
		 * { i++; } (위와같이) 실행값을 넣어주면 안에서 끝날때까지 반복하고 나온다.
		 */
	}
	

}
