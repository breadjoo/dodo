package chap04.sec07;

public class BreakOutterExample {

	public static void main(String[] args) {
		outter : for (char upper='A';upper<='Z'; upper++) {
				 for (char lower='a';lower<='z'; lower++) {
					 System.out.println(upper + "-" + lower);
				 if (lower == 'k') {break outter;}
				 }
			 }
					System.out.println("프로그램 종료");
					
					

		}

}


