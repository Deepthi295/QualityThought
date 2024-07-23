package basics1;
import java.util.Scanner;

public class Ex_GradesusingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Marks");
		int [] s = new int [6];
		 int tot = 0 ;
		 for (int i =0 ; i<s.length;i++) {
			 s[i] = sc.nextInt();
			 tot = tot+s[i];
			 }
  System.out.println("Total marks are:"+tot);
  if (tot >=420) {
	   System.out.println("Grade A");
	   }else if (tot >=350 && tot < 420) {
       System.out.println("Grade B");
	}else if (tot>=300 && tot< 350) {
		System.out.println("Grade C");
	} else if ( tot <300 ) {
		System.out.println("Grade D Fail");
     } 
	 int max =0;
	 for (int i =0 ; i<s.length;i++) {
         if ( max < s[i]) {   
            max = s[i];
    }
		 }
	 System.out.println("Maximum number "+max);
	 int min = s[0];
	 for (int i =0 ; i<s.length;i++) {  
        if (min   >s[i] ) {
       	 min =s[i];
       	 }
        }
	 System.out.println("minimum number "+min );
	}

}
