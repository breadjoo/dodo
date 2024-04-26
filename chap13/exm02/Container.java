package chap13.exm02;

//제네릭 타입 선언
//게리턴세디스티 	
public class Container<T> {
	
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
	
	
}
