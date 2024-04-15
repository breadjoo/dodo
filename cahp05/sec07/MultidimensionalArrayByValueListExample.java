package cahp05.sec07;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] scores = {
				{80, 90, 96},
				{76, 88}
		}; // 배열의 길이
		
			System.out.println("1차원 배열 길이(반의 수) : " + scores.length);
			System.out.println("2차원 배열 길이(첫번째 반의 학생수) : "+ scores[0].length );
			System.out.println("2차원 배열 길이(두번째 반의 학생수) : "+ scores[1].length );
		//1번째 반의 3번째 학생의 점수 읽기
			System.out.println("scores[0][2] : "+scores[0][2]);
		//2번째 반의 2번째 학생의 점수 읽기
			System.out.println("scores[1][1] : "+scores[1][1]);
		//첫번째 반의 평균점수 구하기
		scores [0][1] = 44;
			System.out.println("scores[0][1] : "+scores[0][1]);
			
		int sum = 0;
		for(int i=0;i<scores[0].length;i++) {
			sum += scores[0][i];
		} 	System.out.println("첫 번째 반의 합 : "+sum);
		double avg = (double) sum/scores[0].length;
			System.out.println("첫 번째 반의 평균 : " + avg);
		int sum1 = 0;
		for (int i=0;i<scores[1].length;i++) {
			sum1 += scores[1][i];
		}	System.out.println("두 번째 반의 합 : " + sum1);
		double avg1 = (double) sum1/scores[1].length;
			System.out.println("두 번째 반의 평균 : " + avg1);
		int totalSum = 0;
		int totalStudent = 0;
		for (int i=0;i<scores.length;i++) { // 반의 수만큼 반복
			totalStudent += scores[i].length; //반의 학생 수 합산
			for (int k=0;k<scores[i].length;k++) {
				totalSum += scores[i][k]; // 학생 점수 합산
			}
			
		}
			double totalAvg = (double)totalSum/totalStudent;
			System.out.println("전체 학생의 평균 : " + totalAvg);
	}
	
	

}
