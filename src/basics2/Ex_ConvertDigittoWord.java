package basics2;

import java.util.Scanner;

public class Ex_ConvertDigittoWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string ");
		String s1 = sc.next();
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (Character.isDigit(c)) {
				s2 = s2 + convertDigitToString(c);
			} else {
				s2 = s2 + c;
			}
		}
		System.out.println(s2);
	}

	public static String convertDigitToString(char digit) {
		String value = "";
		switch (digit) {
		case '1':
			value = "one";
			break;
		case '2':
			value = "two";
			break;
		case '3':
			value = "three";
			break;
		case '4':
			value = "four";
			break;
		case '5':
			value = "five";
			break;
		case '6':
			value = "six";
			break;
		case '7':
			value = "seven";
			break;
		case '8':
			value = "eight";
			break;
		case '9':
			value = "nine";
			break;
		case '0':
			value = "zero";
			break;
		}
		return value;
	}
}
