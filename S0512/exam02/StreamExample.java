package S0512.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			Product product = new Product(i+1,"홈런볼"+(i+1),"주식회사빵쥬",(int)(10000*Math.random()));
			
			list.add(product);
		}
		Stream<Product> stream = list.stream();
		stream.forEach( p -> System.out.println(p));
	
	
	}

}

