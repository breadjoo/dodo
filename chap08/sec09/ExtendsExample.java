package chap08.sec09;

public class ExtendsExample {
	public static void main (String[] args) {
		//객체 선언 대입
	InterfaceCImpl impl = new InterfaceCImpl();
	
	InterfaceA iA = impl;
	
	iA.methodA();
	//iA.methodB();
	
	InterfaceB iB = impl;
	
	iB.methodB();
	//iB.methodA();
	
	InterfaceC iC = impl;
	iC.methodA();
	iC.methodB();
	iC.methodC();
	//C는 a,b를 다 상속받았더니 다 되네 ~
		
}
	
}
