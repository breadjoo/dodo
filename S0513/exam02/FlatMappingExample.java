package S0513.exam02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {

	public static void main(String[] args) {

		
		List<String> list = new ArrayList<>();
		List<String> list2 = Arrays.asList("10,20,30,40","50,60");
		
		list.add("this is java");
		list.add("Hi I am java");
		list.add("Nice to meet you");
		
		list.stream()
			.flatMap(data -> Arrays.stream(data.split("")))
			.forEach(s->System.out.println());
		
		list2.stream()
			.flatMapToInt(data -> {
				String [] strArr = data.split(",");
				int [] intArr = new int[strArr.length];
				for(int i=0;i<strArr.length;i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());
				} return Arrays.stream(intArr);
			})
			.forEach(s->System.out.println(s));

}}
