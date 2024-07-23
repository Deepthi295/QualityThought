package practice;

import java.util.Scanner;

public class Ex_RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to rev");
		int x = sc.nextInt();
		int rev = 0;
		while (x > 0) {
		int rem = x % 10;
		rev = rev * 10 + rem;
		x = x / 10;
		}
		System.out.println("Reveresr of a number:" + rev);

	}

}
