package chap05.sec011;

public class MainStringArrayArgument1 {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("프로그램이 입력값이 부족합니다.");
			System.exit(0);
		}
		String argNum0 = args[0];
		String argNum1 = args[1];
		String argNum2 = args[2];
			System.out.println("args[0]="+argNum0);
			System.out.println("args[1]="+argNum1);
			System.out.println("args[2]="+argNum2);
		
	//	for(int i=0;i>args.length;i++) {
		//	System.out.println(args[i]);
		//}
		
		
}}


//int num0 = Integer.parseInt(argNum0);
//int num1 = Integer.parseInt(argNum1);
//int num2 = Integer.parseInt(argNum2);

//int sum = num0+num1+num2 ;

//System.out.println(num0+"+"+num1+"+"+num2+"="+sum);
