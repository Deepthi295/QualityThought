package basics;

import java.util.Scanner;

public class EX_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int x = sc.nextInt();
		int value = x;
		int rev = 0;
		while (x > 0) {
			int rem = x % 10;
			rev = rev * 10 + rem;
			x = x / 10;
		}
		System.out.println("Reverse no:");
		if (value == rev) {
			System.out.println("Given number is palindrome" + value);

		} else {
			System.out.println("Given number is not Palindrome " + value);
		}
	}

}
