package chap05.sec012;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		int [] scores = new int [2];
		int studentNum = 0;
		int sum = 0;
		int people = 0;
		int max = 0;
		int min = 0;
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 |2.점수입력 |3.점수리스트 |4.분석 |5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			int aaa = scanner.nextInt();
		if (aaa == 1) {
			System.out.println("학생수>");
			studentNum += scanner.nextInt();
			scores = new int [studentNum];
		} else if (aaa == 2) {
			for(int i=0;i<scores.length;i++) {
			System.out.print("scores["+i+"]");
			scores[i] = scanner.nextInt();
		}} else if (aaa == 3) {
			for(int i=0;i<scores.length;i++) {
			System.out.println(i+"번학생의 점수 : "+scores[i]);
		} } else if (aaa == 4) {
			for(int i=0;i<scores.length;i++) {
			sum += scores[i];
			for(int x=0;x<scores.length;x++) {
			if (max<scores[x]);
			max = scores[x];
			}for(int y=0;y<scores.length;y++) {
			if (min>scores[y]);
			 scores[y] = min;
			}
			
			}double avg = (double)sum/studentNum;
			System.out.println("점수 합 : "+sum);
			System.out.println("학생 수 : "+studentNum);
			System.out.println("최고 점수 : " + max);
			System.out.println("최저 점수 : " + min);
			System.out.println("점수 평균 : "+avg);
			} else if (aaa == 5) {
				System.out.println("프로그램이 종료되었습니다.");
				run = false; 
			} 
			} 
			
	}
		}
				
		


	


