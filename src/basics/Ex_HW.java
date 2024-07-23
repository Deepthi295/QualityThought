package basics;

import java.util.Scanner;

public class Ex_HW {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total marks");
		int tot = sc.nextInt();
		if (tot >= 700) {
			System.out.println("Grade A");
		} else if (tot > 600 && tot < 700) {
			System.out.println("Grade B");
		} else if (tot >= 500 && tot < 600) {
			System.out.println("Grade c");
		} else if (tot < 500) {
			System.out.println("grade D Fail");
		}
	}

}
