package S0512.exam02;

import java.util.Scanner;

public class SchoolAvgSystem {

	public static void main(String[] args) {
		
		//갑자기 해보고 싶어서 해보는 심심풀이 프로그래밍
		// 1.학생수 2.점수입력 3.점수리스트 4.분석 (총합,평균등) 5.종료 
		Scanner scanner = new Scanner(System.in);
		int studentNum = 0;
		int [] array = new int[2];
		int sum = 0;
		double avg = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("======================================");
			System.out.println("1.학생수 |2.점수입력 |3.리스트 |4.분석 |5.종료");
			System.out.println("======================================");
			System.out.print("행동을 입력하시오 : " );
			int value = scanner.nextInt();
			switch(value) {
			case 1 : 
				System.out.print("학생수를 입력하시오 : ");
				studentNum = scanner.nextInt();
				System.out.println("1. 학생수 : " +studentNum); 
				array = new int[studentNum];
				break;
				
			case 2 : 
				System.out.print("학생들의 점수를 차례대로 입력하시오 : ");
				for(int i =0;i<array.length;i++) {
					array[i] = scanner.nextInt();
					sum += array[i];
				}break;
				
			case 3 : 
				for(int i=0;i<array.length;i++) {
					System.out.println((i+1)+"번학생 점수 :" +array[i]+"점");
				} break;
				
			case 4 : 
				avg = sum/array.length;
				System.out.println("학생 수 : " + studentNum);
				System.out.println("학생들의 점수 총합 : " + sum);
				System.out.println("학생들의 평균 : " + avg);
				break;
			
			default :
				System.out.println("프로그램 종료");
				run = false;
			
			} 
			
		}

	}

}


/* 다음에 추가해보고 싶은 기능 : 학생 이름, 점수 같이 나오게 하는거랑
 * 과목 2가지 정도 해보기 , 최고점수 학생, x점 이상의 학생 리스트 뽑기
 * 
*/