package chap02.sec06;

public class TextBlockExample {

	public static void main(String[] args) {
		// 
		String str1 = "" + 
					  "{\n" + 
					  "\t\"id\":\"winter\",\n"+
					  "\t\"name\" :\"눈송이\" \n" +
					  "}";
		String str2 = """
				{
					"id" : "winter",
					"name" : "summer"					
				}
				""";
			System.out.println(str1);
			System.out.println("---------------------");
			System.out.println(str2);
		String str3 = """
				나는 자바를 \t 아주 \t 잘하고 싶어요
				나는 자바 고수가 될 겁니다.
				나는 자바 \
				고수가 될\
				 겁니다.
				""";
			System.out.println(str3);
	}

}
