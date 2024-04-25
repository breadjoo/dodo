package S0425.exam01;

import java.util.Arrays;
import java.util.Random;

public class RandomExample1 {

	public static void main (String [] args) {
		 // 로또 당첨 확인 만들기
		int [] selectNum = new int [6];
		int [] winningNum = new int [6];
		Random random = new Random();
		System.out.print("선택 번호 : ");
		for(int i=0;i<selectNum.length; i++) {
			selectNum[i] = random.nextInt(45)+1;
			System.out.print("["+selectNum[i]+"]");
		}
		System.out.println();
		System.out.print("당첨 번호 : ");
		for(int i=0;i<winningNum.length;i++) {
			winningNum[i] = random.nextInt(45)+1;
			System.out.print("["+winningNum[i]+"]");
		}
		System.out.println();
		Arrays.sort(selectNum);
		Arrays.sort(winningNum);
		
		boolean result = Arrays.equals(winningNum,selectNum);
		if(result) {
			System.out.println("결과는 !! : 당첨");
		} else {
			System.out.println("결과는 !! : 미당첨");
		}
		
	
	}
}
