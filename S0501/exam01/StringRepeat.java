package S0501.exam01;

import java.util.Scanner;
//str 이 n번 반복되는 문장
//입력 : str / 5 
//출력 : str str str str str 

public class StringRepeat {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	int n = sc.nextInt();
    	
    	if(n<=5 && n>=1) {
    		for(int i=0;i<=n;i++) {
    			System.out.print(str);
    		}
    		//System.out.print(str.repeat(n));
    	} 
    	
        
    }
}

/*
Scanner sc = new Scanner(System.in);
System.out.print("반복하고 싶은 문자열을 입력 : ");
String str = sc.next();
System.out.println("");
System.out.print("반복하고 싶은 횟수를 입력 : ");
int n = sc.nextInt();

String [] a = new String[5];
for(n=0;n<a.length;n++) {
	a[n] = str;
	System.out.print(a[n]+ " ");
}
*/