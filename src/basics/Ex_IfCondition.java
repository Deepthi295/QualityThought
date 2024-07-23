package basics;

import java.util.Scanner;

public class Ex_IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		if (x < 100) {
			System.out.println("Value is less than 100");
		} else if (x > 100) {
			System.out.println("Value is greater than 100");
		} else {
			System.out.println("Value is equal to 100");
		}
	}

}
