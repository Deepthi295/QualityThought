package basics2;

public class Ex_Noofspacesandwordsinthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java selenium at classes at quality thought at institute";

		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ') {
				count = count + 1;
			}
		}

		System.out.println("Total no of Spaces in Given String are: " + count);

		String[] a = s1.split("at");
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		String[] c = s1.split(" ");
		System.out.println(c.length);
		System.out.println("Count of Spaces: " + (c.length - 1));
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

	}

}
