package S0421.exam01;

public class BreakOutter {

	public static void main(String [] args) {
		
		outter : for (char upper='A';upper<='Z';upper++) {
			for (char lower='a';lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				if(lower =='k') {
					break outter;
				}
			}
		}
	}
}
/* 변수 : for 문 복습
 * outter 자체가 프로그램 인것처럼 제목 : 하고 for로 시작
 * if 조건을 주고 해당될 때 outter 를 종료 ( break outter; )
 *  일단외우자~ 
 */
