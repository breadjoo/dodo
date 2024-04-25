package chap12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExmaple {

	public static void main(String[] args) {
		// 
		int [] selectNumber = new int[6] ; // 선택 번호 6개가 저장될 배열생성
		Random random = new Random(); // Random객체 생성
		System.out.print("선택 번호 :" );
		for(int i=0; i<selectNumber.length; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			//nexInt(int n):int타입의 난수를 리턴(0<=x~<n)
			System.out.print(" [ "+selectNumber[i]+" ]");
			
		} System.out.println();
		Random random2 = new Random();
		int [] winningNumber = new int[6];
		System.out.print("당첨 번호 :");
		for(int i=0;i<winningNumber.length;i++) {
			winningNumber[i] = random2.nextInt(45)+1;
			System.out.print(" [ " + winningNumber[i] + " ]");
		}
		Arrays.sort(winningNumber);
		Arrays.sort(selectNumber);
		boolean result = Arrays.equals(winningNumber, selectNumber) ;
		System.out.println();
		System.out.print("당첨여부 : ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
		/*Random 메소드 : 0.0~1.0사이의 double 타입 난수를 리턴,
		 * int num (int)(Math.random()*n) + start;
		 * start ~ n까지의 정수를 얻는 공식
		 * 
		 * java.util.Random 클래스를 이용 -> boolean, int, double 난수를 얻음
		 * Random():현재 시간을 이용해서 종자값을 자동 설정
		 * Random(long seed): 주어진 종자값을 사용
		 * 
		 */
		

	}

}
