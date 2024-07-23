package basics;

import java.util.Scanner;

public class EX_OddEvenPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value ");
		int x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("Given number is Even Number:" + x);
		} else {
			System.out.println("Given number is odd number :" + x);
		}
		int count = 1;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				count = count + 1;
				break;
			}
			if (count > 1) {
				System.out.println("Given numner is not a prime number:" + x);
			} else {
				System.out.println("Given number is a prime Number:" + x);
			}
		}

	}
}
