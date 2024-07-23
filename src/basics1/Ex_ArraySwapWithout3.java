package basics1;

public class Ex_ArraySwapWithout3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 50;
		   int b = 52;
		     System.out.println("initial value  of:"+a) ;
		     System.out.println("initial value of :"+b);
		       a =a+b;  //   a= 50+52=102
		        b= a-b;   // b= 102-52=50
		         a= a-b; //   a=102-50=52
		         System.out.println("After swap:"+a);
		         System.out.println("After swap:"+b);
	}

}
