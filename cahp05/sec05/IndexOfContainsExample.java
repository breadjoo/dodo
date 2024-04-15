package cahp05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		String find = "자바";
		int location = subject.indexOf("프로");
			System.out.println(location);
		String subway = subject.substring(location);
			System.out.println(subway);
		location = subject.indexOf(find);
			System.out.println(location);
		if(location !=-1) {
			System.out.println(find+" 키워드를 찾았습니다.");
		} else {
			System.out.println(find+" 키워드를 찾지 못했습니다.");
		}
		boolean result = subject.contains(find);
		if (result) {
			System.out.println(find+" 키워드를 찾았습니다.");
		} else {
			System.out.println(find+" 키워드를 찾지 못했습니다.");
		}
	}

}
