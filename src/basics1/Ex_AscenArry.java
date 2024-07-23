package basics1;

public class Ex_AscenArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] x = {12,39,30,23,12,40,23,39,44};
	     for ( int i = 0; i<x.length;i++) {
	         int asc = 0;
	      for (int j = i+1 ; j < x.length; j++) {
		    if (x[i] > x [j]) {   //12>39
	   		 asc = x[i];   //   0=12
	   		 x[i] = x[j];  //  x[i] = 39
	   		 x[j] = asc;   //   x[j] = 0
	   		 
	           }
		    }
	      }
	     for (int i =0;i<x.length;i++) {
		      System.out.println(x[i]);
       }
   }
}