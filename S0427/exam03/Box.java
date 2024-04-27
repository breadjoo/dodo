package S0427.exam03;

public class Box <T> {
	 public T content;
	
	 public boolean compare (Box<T> other) {
		 boolean result1 = content.equals(other.content);
		 return result1;
	 }
		 
	 

}
