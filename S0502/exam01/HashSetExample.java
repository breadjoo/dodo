package S0502.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set <String> set = new HashSet<>();
		
		set.add("Asdf");
		set.add("asdf");
		set.add("100");
		set.add("100");
					
		int size = set.size();
		System.out.println(size);
		
			
	}

}
