package basics;

import java.util.Scanner;

public class Ex_ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Entere the number");
		int x = sc.nextInt(); // x=123456
		int rev = 0; // rev=0;
		while (x > 0) { // while (123456>0)
			int rem = x % 10; // int rem =123456%10 (6) as rem
			rev = rev * 10 + rem; // rev=0*10+6=6;
			x = x / 10; // x=123456/10 (12345)
		}
		System.out.println("Reverse:" + rev);
	}

}
