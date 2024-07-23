package basics1;

public class Ex_CountevenOddInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x = { 12,39,30,23,12,40,23,39,44 } ;
		   int evencount = 0;
	        int oddcount = 0;
	      for (int i = 0; i <x.length;i++) {
	    	  if (x[i]%2==0) {
				  evencount = evencount +1;
	               }
	    	  }
	      System.out.println("Even number count "+evencount);// it will display the no of even numbers 
	      for (int i= 0; i<x.length;i++) {
	    	   if (x[i]%2!=0) {
	    		   oddcount = oddcount+1;
	    	}
		  }
	      System.out.println("Odd number count "+oddcount);//it will display the no of odd numbers  
	}

}
