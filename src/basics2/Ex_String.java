package basics2;

import java.util.Scanner;

public class Ex_String {

	public static void main(String[] args) {

		String str = "Quality Thought";
		System.out.println(str);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String str1 = sc.nextLine(); // out put it will display the str as quality thought and str1 as given input
		System.out.println(str1);

	}

}
