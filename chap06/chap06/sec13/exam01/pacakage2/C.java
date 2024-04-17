package chap06.sec13.exam01.pacakage2;

import chap06.sec13.exam01.pacakage1.B;

public class C {
	// 필드 선언
	A a; // X <== A 클래스는 default로 선언되어 있어서 다른 패키지에서는 사용 불가
	B b; // O <== public 선언자는 다른 패키지에서 import하면 사용 가능
	
	
}
