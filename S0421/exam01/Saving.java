package S0421.exam01;

import java.util.Scanner;

public class Saving {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int before = sc.nextInt();
		int after = sc.nextInt();

		int money = start;
		int month = 1;
		while (money < 70) {
			money += 24;
			month++;
		}
		while (before<100) {
			money += 20;
			month++;
		}
		System.out.println(month);
	}

}
