package chap03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; // 1 증가
			System.out.println("x++ : "+ x);
		++x;
			System.out.println("++x : "+ x);
			System.out.println("---------------------");
		y--; // 1 감소
			System.out.println("y-- : "+ y);
		--y;
			System.out.println("--y : "+ y);
			System.out.println("---------------------");
		z = x++; // x값을 먼저 z에 대입하고 나중에 연산
			System.out.println("z : " + z);
			System.out.println("x : " + x);
			System.out.println("---------------------");
		z = ++x; // x값을 먼저 증가시킨 후에 값을 대입
			System.out.println("z : "+ z);
			System.out.println("x : " + x);
			System.out.println("---------------------");
		z = ++x + y++;
			System.out.println("z : "+ z);
			System.out.println("x : "+ x);
			System.out.println("y : "+ y);
	}

}
