package S0509.exam04;

@FunctionalInterface
public interface Calcuable {
	double calc(double x, double y);
	
	
	//doublex,y를 이용해서 x+y 정적메소드 x * y 인스턴스 메소드 생성
	// 정적메소드 일때는 클래스 :: 메소드 
	// 인스턴스 일때는 객체를 생성하고, 변수 :: 메소드
	//주어지는 값은 알아서. 출력내용 : 결과값 : x^y
}
