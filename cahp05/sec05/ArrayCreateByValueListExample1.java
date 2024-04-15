package cahp05.sec05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		
		String[] season = {"spring","summer","fall","winter"};

		for (int i=0;i<season.length;i++) {
			System.out.println(season[i]);
			
		} season[1] = "여름";
			System.out.println("season[1] : " + season[1]);
			
		int[] scores = { 83, 90, 87};
		int sum = 0;
		for (int x=1;x<scores.length;x++) {
			sum += scores[x];
		}
	}

}

