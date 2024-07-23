package basics2;

public class Ex_swapstringby3rdvaraiable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "deepthi";
		String s2 = "kishore";
		String s3 = "";

		System.out.println("initial string s1 =" + s1);
		System.out.println("initial string s2=" + s2);

//             s3=s1;
//             s1=s2;
//             s2=s3;
//             System.out.println("after swap   "+s1);
//             System.out.println("after swap   "+s2);
//             
		int s1Size = s1.length();
		int s2Size = s2.length();
		s2 = s2 + s1;

		s1 = s2.substring(0, s2Size);
		s2 = s2.substring(s2Size);

		System.out.println(s1);
		System.out.println(s2);
	}

}
