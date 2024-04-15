package cahp05.sec05;

public class LengthExample {

	public static void main(String[] args) {
		String ssn = "9404022222334";
		int length = ssn.length();
		char s = ssn.charAt(0);
		if(length == 13) {
			System.out.println("주민등록 번호 자릿 수 : "+length);
		} else {
			System.out.println("입력이 잘못됐습니다.");
		} switch (s) {
		case '9 ':
		case '3':
			System.out.println("male"); break;
		case '2':
		case '4':
			System.out.println("female");
			
		}

	}

}
