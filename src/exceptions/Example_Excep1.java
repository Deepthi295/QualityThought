package exceptions;

import java.util.Scanner;

public class Example_Excep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value to divide");
		int y = sc.nextInt();
		System.out.println(y);
		
		
		try {
			value= x/0;
			System.out.println(value);
			
		} catch (Exception e ) {
			// TODO: handle exception
			//System.out.println("Arthematical Exception cannot divide by zero");
		}
		value = x / 5;
		System.out.println(value);
	}

}
