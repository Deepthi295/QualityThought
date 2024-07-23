package basics;

import java.util.Scanner;

public class Ex_NestedIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a  value ");
		int a = sc.nextInt();
		if (a >= 200) {
			System.out.println("welcome");
			if (a <= 300) {
				System.out.println("Ramesh");
				if (a <= 200) {
					System.out.println("Varun");
					if (a <= 50) {
						System.out.println("kalayn");
					} else {
						System.out.println("pavan");
					}
				} else {
					System.out.println("Rajesh");
				}
				System.out.println("jai balaya");
			}
			System.out.println("bond james bond ");
		} else {
			System.out.println("good bye ");
		}
	}

}
