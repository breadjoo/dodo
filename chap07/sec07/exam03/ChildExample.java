package chap07.sec07.exam03;

public class ChildExample {

	public static void main(String[] args) {
		//객체 생성 및 자동 타입 변환
		Parent parent = new Child();
		
		// Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		//parent.method3(); 접근 불가능 컴파일 에러 - parent가 아니라 child에 있는 method.
		//parent.field2 = "data2"; 위와 같은 이유.
		
		
		//강제 타입 변환
		Child child = (Child) parent;
		
		child.field2 = "data2";
		child.method3();
		child.method1();
		
		

	}

}
