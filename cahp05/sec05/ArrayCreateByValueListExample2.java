package cahp05.sec05;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {

		String[] season = {"봄","여름","가을","겨울"};

		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
		for (int i=0;i<season.length;i++) {
			System.out.println(season[i]);
			
		} season[1] = "summer";
			System.out.println("season[1] : " + season[1]);
			
		int[] scores = { 83, 90, 87, 60, 99, 100, 88};
		int sum = 0;
		for (int x=0;x<scores.length;x++) {
			sum += scores[x];
		}
			System.out.println("총합 : " + sum);
		double avg = (double)sum / scores.length;
			System.out.println("평균 : " + avg); 
			System.out.println(scores.length);
	}

}
