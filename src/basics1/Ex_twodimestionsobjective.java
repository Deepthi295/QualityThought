package basics1;

public class Ex_twodimestionsobjective {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[][] a  = new Object[4][3];
		
		a[0][0] = 10;
		a[0][1] = 'u';
		a[0][2] = "Deepthipadigepati";

		a[1][0] = 89.03;
        a[1][1] = false;
        a[1][2] = 9987894 ;

		a[2][0] = 87.098457;
		a[2][1] = "nithya";
		a[2][2] = 395;
		
		 for(int i = 0;i<a.length;i++) {
			 for (int j = 0; j<3;j++) {
				 
				 System.out.println(a[i][j]);
				 
			 }
		 }

	}

}