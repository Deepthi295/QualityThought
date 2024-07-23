package basics1;

public class Ex_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x = new int [5];
		  x[0] = 10;
		  x[1] = 20;
		  x[2] = 30;
		  x[3] = 40;
		  x[4] = 50;
		  System.out.println(x.length);   //5
		  System.out.println(x[3]);       //40
		  System.out.println(x);          // it will show the address of the x value 
		   for (int i = 0 ;i <x.length;i++) {
			   System.out.print(x[i]+" ");  //it will display the all x values
			   }
		 // System.out.println(x[5]);
		  int [] p = {100,200,300,400,500,600};
		  for (int i = 0;i<p.length;i++) {
			  System.out.println(p[i]);
		  }
		
	}

}
