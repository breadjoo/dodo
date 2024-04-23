package chap12.sec03.exam02;

public class Student {

	private int no;
	private String name;
	
	public Student(int no,String name) {
		this.no=no;
		this.name=name;
	}
	
	public int getNo() { // 선언을 private으로 해놨기 때문에 main method에서 수정이 불가능하므로 set은 못쓰고 get만 사용가능
		return no;
		} public String getName() {
			return name; 
			}
	
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
		/* Object의 hashCode()메소드를 정의해서
		 * 학생번호(no)와 이름 해시코드(name.hashCode())를 합한
		 * 새로운 해시코드를 리턴하도록 함 (번호와 이름이 같으면 동일한 해시코드가 생성됨)
		 */
	}
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(no == target.getNo() && name.equals(target.getName())){
				return true;
			}
		}
		return false;
	}
	
}
