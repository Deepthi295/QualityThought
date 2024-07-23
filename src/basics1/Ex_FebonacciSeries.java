package basics1;

import java.util.Scanner;

public class Ex_FebonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	      System.out.println("Enter the range of Febonacci series");
	      int n = sc.nextInt();  // n = 15 
	      int a = 0;
	      int b = 1;
	      int c = 0;
	      System.out.println(a); // it will display the febonacci numbers from 0 to 15 
	      System.out.println(b);// 0 1 1 2 3 5  8 13 21 
	        while(c<=n) {
	        	c=a+b;
	        	System.out.println(c);
	        	a=b;
	        	b=c;
	        	
	        }
		
	}

}
