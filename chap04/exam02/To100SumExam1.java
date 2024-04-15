package chap04.exam02;

public class To100SumExam1 {

	public static void main(String[] args) {
		int sum = 0;
		int x;
		for(x=1;x<=100;x++)
			sum += x;
		System.out.println(sum);
		
		int sum1 =0;
		int y = 1;
		while(y<=100) {
			sum1 += y;
			y++;
		} System.out.println(sum1);
		
	}

}

