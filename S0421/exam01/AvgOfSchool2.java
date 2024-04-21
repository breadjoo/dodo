package S0421.exam01;

import java.util.Scanner;

public class AvgOfSchool2 {

	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in) ;
		int [] scores = new int [2];
		int studentNum = 0;
		int sum = 0;
		double avg = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("=====================================");
			System.out.println("|1.학생수 |2.점수 |3. 평가 |4.종료 |");
			System.out.println("=====================================");
			System.out.println("원하는 실행번호를 입력하시오 (1,2,3,4)");
			
		String input = scanner.nextLine();
		if(input.equals("1")) {
			System.out.println("1.학생수를 입력하시오 : ");
			studentNum = scanner.nextInt();
			scores = new int [studentNum];
			scanner.nextLine();			
		} else if (input.equals("2")) {
			System.out.println("2.차례대로 점수를 입력하시오 : ");
			for(int i=0;i<scores.length;i++) {
				scores[i] = scanner.nextInt();
				scanner.nextLine();
			}
		} else if (input.equals("3")) {
			for(int i=0;i<scores.length;i++) {
				sum += scores[i];
				avg = (double) sum/studentNum;
			}
			System.out.println("학생수 : " + studentNum);
			System.out.println("점수 총합 : "+sum);
			System.out.println("점수 평균 : "+avg);
		} else if (input.equals("4")) {
			run = false;
			System.out.println("프로그램 종료");
		}
		}
		
		
		
	}
}
