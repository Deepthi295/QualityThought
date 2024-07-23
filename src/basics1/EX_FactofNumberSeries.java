package basics1;

import java.util.Scanner;


public class EX_FactofNumberSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		  System.out.println("Enter a number series");
		  int x = sc.nextInt();
		     while (x>0) {   //
		    int rem = x%10;
		    	factorial(rem);
		    	  x=x/10;
		     }
			}
		    public static void factorial(int n) {
		    int fact =1;
		    while (n>0) {
		    	fact = fact *n;
		    	n=n-1;
		    	
		    }
		    System.out.println(fact);
	}

}
