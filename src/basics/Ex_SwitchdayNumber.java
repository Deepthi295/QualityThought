package basics;

import java.util.Scanner;

public class Ex_SwitchdayNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day Name to dispaly day number:");
		String dayname = sc.nextLine();
		switch (dayname) {
		case "monday":
			System.out.println("1");
			break;
		case "tuesday":
			System.out.println("2");
			break;
		case "Wednesday":
			System.out.println("3");
			break;
		case "Thursday":
			System.out.println("4");
			break;
		case "Friday":
			System.out.println("5");
			break;
		case "saturday":
			System.out.println("6");
			break;
		case "sunday":
			System.out.println("7");
		default:
			System.out.println("Invalid day namae....");
		}

	}

}
