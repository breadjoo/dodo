package chap12.sec03.exam05;

import lombok.Data;
import lombok.NonNull;

/*@data
 * 컴파일 과정에서 기본 생성자와 함께 'Getter, Setter, hashCode(), equals(), toString()' 메소드가 자동 생성됨 */

@Data
public class Member {

	private final String id;
	@NonNull private String name;
	//@NonNull
	//Null이 아닌 다른 값으로 Setter 메소드를 통해 변경할 수 있음.
	
	private int age;
}
