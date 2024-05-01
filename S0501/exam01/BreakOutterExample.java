package S0501.exam01;

public class BreakOutterExample {

	public static void main(String[] args) {
		for(char upper='A';upper<='Z';upper++) {
			for (char lower ='a';lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				if (lower == 'z') {break;}
			}
		}
		System.out.println("끝");


	}

}
