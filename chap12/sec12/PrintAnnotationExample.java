package chap12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	/*Service 클래스에 선언된 메소드를 리플렉션해서
	 * @PrintAnnotation 설정 정보를 얻어낸 후
	 * 구분선을 출력하고 해당 메소드를 호출함	 */

	public static void main(String[] args) throws Exception {
		Method[] declaredMethods = Service.class.getDeclaredMethods();//메소드 정보 읽기
		for(Method method : declaredMethods) {
			//PrintAnnotation 얻기
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			//지정한 Annotation이 적용되어 있으면 Annotation 리턴, 그렇지 않으면 null 리턴
			
			//설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
			
			//메소드 호출
			method.invoke(new Service());
			
			//설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
			}
	}

	public static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation != null) {
			int number = printAnnotation.number();
			for(int i=0;i<number;i++) {
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}
}
