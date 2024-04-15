package chap05.sec012;

public class MatrixExample {

	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum = 0;
		int all = 0;
		for (int i=0;i<array.length;i++) {
			all += array[i].length;
			for (int x=0;x<array[i].length;x++) {
				
				sum += array[i][x];
			}
		}double avg = (double)sum/all;
		System.out.println("합 : " + sum);
		System.out.println("갯수 : " + all);
		System.out.println("평균 : " + avg);
		
		
		
		
	}

}