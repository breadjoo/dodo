package cahp05.sec07;

import javax.sql.rowset.serial.SQLOutputImpl;

public class MultidiemsionalArrayByNewExample {

	public static void main(String[] args) {
		int [][] mathScores = new int [2][3];
		for (int i=0;i<mathScores.length;i++) {
			for (int k=0;k<mathScores[i].length;k++) {
				System.out.println("mathScores["+i+"]["+k+"]:" + mathScores[i][k]);
			}
		}
		System.out.println();
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85; 
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		//전체 학생의 평균 구하기
		int totalSum = 0;
		int totalStudent = 0;
		for (int i=0;i<mathScores.length;i++) {
			totalStudent += mathScores[i].length; //반의 학생 수 합산
			for (int k=0;k<mathScores[i].length;k++) { // 행의 학생 수 만큼 반복
				totalSum += mathScores[i][k] ; // 학생 점수 합산
			}
		}
		double totalAvg = (double) totalSum/totalStudent ;
		System.out.println("전체 학생의 평균 : " + totalAvg);
		System.out.println();
		//각 반의 학생 수가 다를 경우 점수 저장을 위한 2차열 배열 생성
		int [][] engScores = new int [2][];
		engScores[0] = new int[2];
		engScores[1] = new int[3];
		for (int i=0;i<engScores.length;i++) { // 반의 수 만큼 반복
			for (int k=0;k<engScores[i].length;k++) { // 해당 행의 학생 수 만큼 반복
				System.out.println("engScores["+i+"]["+k+"]:"+engScores[i][k]);
				
			}
		}
		System.out.println();
		engScores[0][0] = 77;
		engScores[0][1] = 80;
		engScores[1][0] = 57;
		engScores[1][1] = 33;
		engScores[1][2] = 97;
		for (int i=0;i<engScores.length;i++) { 
			for (int k=0;k<engScores[i].length;k++) { 
				System.out.println("engScores["+i+"]["+k+"]}:"+engScores[i][k]); }}
		//전체 학생의 영어 평균 구하기
		int engStudent = 0;
		int engSum = 0;
		for (int i=0;i<engScores.length;i++) {
			engStudent += engScores[i].length ;
			for (int k=0;k<engScores[i].length;k++) {
				engSum += engScores[i][k];
			}	}
		double engAvg = (double) engSum/engStudent;
				System.out.println("영어 전체 평균 : " + engAvg);
	}			
	
}
