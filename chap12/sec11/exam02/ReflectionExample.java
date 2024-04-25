package chap12.sec11.exam02;

import java.lang.reflect.*;

public class ReflectionExample {

	public static void main(String[] args) throws Exception{
		Class class2 = Car.class;
		System.out.println("[생성자 정보]");
		Constructor[] constructors = class2.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName()+"(");
			//getName():패키지를 포함한 전체 타입 이름 arameterTypes();
			printParameters(parameters);
			System.out.print(")");
		}System.out.println("----------");
		
	}
	
	private static void printParameters(Class[] parameters) {
		for(int i=0;i<parameters.length;i++) {
			System.out.println(parameters[i].getName());
			if(i<(parameters.length-1)) {
				System.out.print(",");
			}
		}
	}

}
