package chap04.exam02;

public class For_exam1 {

	public static void main(String[] args) {
// * ** *** **** **** 프린팅하기
		int x;
		int y;
		for(x=1;x<=5;x++) {
		for(y=1;y<=x ;y++) {
			System.out.print("*");
		if(y==x) {
			System.out.println("");
		}
		}
		}
	}

}
