package basics2;

public class Ex_CapitalizeFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Principal madam and mom are good friends";
		
		String[] s1  = s.split(" ");
//		System.out.println(s.length());
//		System.out.println(s1.length);
		String s2 = "";
		System.out.println(s2);
		for (int i = 0; i < s1.length ;i++) {
			s2 = s1[i].substring(0,1).toUpperCase()+s1[i].substring(1);
			 System.out.println(s2);
		}
	}

}
