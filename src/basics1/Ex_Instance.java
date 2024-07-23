package basics1;

public class Ex_Instance {

		// TODO Auto-generated method stub
		static int x ;
		static int z;
		 int y ;
	     int a;
	      public static void main (String[]args) {
		 x= 20;
		 z = 30;
		 add();
		 Ex_Instance i1 = new Ex_Instance ();
		 i1.y = 200;
		 i1.show ();
	     Ex_Instance i2 = new Ex_Instance();
	     i2 .a = 300;
	     i2 .show();

	}
	  public static void add() {
		 
		  System.out.println(x+z);
	  }
	  public void show () {
		  System.out.println(y+a);
	}

}
