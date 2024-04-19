package chap08.sec13;

public class SealedExample {

	public static void main(String[] args) {
		ImplClass impl = new ImplClass();
		InterfaceA iA = impl;
		
		iA.methodA();System.out.println();
		
		InterfaceB iB = impl;
		iB.methodB();
		iB.methodA();System.out.println();
		
		InterfaceC iC = impl;
		iC.methodC();
		iC.methodB();
		iC.methodA();System.out.println();
		


	}

}
