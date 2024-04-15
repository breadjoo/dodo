package chap03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		//int charCode = 'A';
		//int charCode = 'b';
		int charCode = 100 ;
		
		
		//if ((xx<=code) && (code<=yy) { 
		// System.out.println(xx입니다.);}
		
			if((65<=charCode) & (charCode<=90)) {
				System.out.println("대문자입니다.");
			}
			if((97<=charCode) && (charCode<=122)) {
				System.out.println("소문자입니다.");
			}
			if((48<=charCode) && (charCode<=57))
				System.out.println("0~9 숫자입니다.");
			if((37<=charCode) || (charCode<=47)||
				(58<=charCode) || (charCode<=64)||
				(91<=charCode) || (charCode<=96)||
				(123<=charCode) || (charCode<=126)) {
				System.out.println("특수문자입니다.");
			}
				
		int x = 369;
		//int x = 7;
		if(
			(x % 2 == 0 ) | (x % 3 == 0) 
															) {
				System.out.println("x는 2 or 3의 배수입니다.");
		}
		
		boolean result = (x % 2 == 0) || (x % 3 == 0);
				System.out.println("증명 : " + result);
		if(!result) {
				System.out.println("2or3의 배수가 아닙니다.");
		}
	}

}
