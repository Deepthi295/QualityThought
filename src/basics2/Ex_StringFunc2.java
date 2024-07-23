package basics2;

public class Ex_StringFunc2 {

	public static void main(String[] args) {

		String str = "Java selenium at for Automation";
		String s1 = str.substring(5);
		System.out.println(s1); // it will start displaying from 5 character to the end
		System.out.println(str.substring(5, 16)); // it will display from 5th char to 16th char only remaning it wont

		String[] c = str.split(" ", 3);
		System.out.println(c.length); // it will split the string and display the no of words in the given string
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]); // it will split the string as 3 it will split as 3 words
		}

		String str1 = "Raj";
		String str2 = "kumar";
		System.out.println(str1.concat(str2)); // it will combine two strings into one string

		System.out.println("*****************************************");
		str = "Java selenium at for Java Automation";

		System.out.println(str);
		int index = str.indexOf("selenium"); // it will display the index of selenium starting
		System.out.println(index);
		System.out.println(str.indexOf('a', 5));
		System.out.println(str.indexOf("Java"));

		System.out.println(str.indexOf("Java", 5));

		System.out.println(str.replace("a", "@")); // it will replace the char in the string to another string which we
													// gave
		System.out.println(str.replace("Java", "python"));
		System.out.println(str.replaceFirst("Java", "python"));
		System.out.println(str.replace("Java", "J@v@"));

		int x = 9000;
		String y = "selenium 9000";
		boolean b = y.contains(String.valueOf(x)); // if we want to combine a string and int we will us contain string
													// value of function
		System.out.println(b);

		double d1 = 90.876;
		double d2 = 89.766;

		double d3 = d1 + d2;
		System.out.println(d3);

		String p = "value:";
		System.out.println("value of p" + p);
		String w = String.valueOf(d1) + String.valueOf(d2);
		System.out.println(w);

	}
}
