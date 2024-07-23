package basics2;

public class Ex_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   StringBuffer s1 = new StringBuffer("java");
   System.out.println(s1);
   s1.append("Selenium");
   System.out.println(s1);
     
    s1.insert(4,"-");
    System.out.println(s1);
	s1.reverse();
	System.out.println(s1);
		
	s1.reverse();
	s1.delete(4,6);
	System.out.println(s1);
	s1.insert(4,'s');
	System.out.println(s1);
	s1.replace(4, 11,"Program");
	System.out.println(s1);
	System.out.println(s1.length());
	s1.substring(4);
	System.out.println(s1);
		
		
	}

}
