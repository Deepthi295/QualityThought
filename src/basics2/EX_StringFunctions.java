package basics2;

public class EX_StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java Selenium classes at quality thought institute";
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == ' ') {  // it will display the no of spaces in the string
				count++;
			}
		}

		System.out.println("String contains no of spaces " + count);

		String[] a = s1.split("at");
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		String[] c = s1.split(" ");
		System.out.println(c.length);
		System.out.println("count of spaces " + (c.length - 1));
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);

		}
	}
}