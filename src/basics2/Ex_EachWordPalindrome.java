package basics2;

public class Ex_EachWordPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "principle madam and mom are good friends";
		String[] s = str.split(" ");

		for (int i = 0; i < s.length; i++) {
			String temp = "";
			for (int j = s[i].length() - 1; j >= 0; j--) {
				temp = temp + s[i].charAt(j);
			}
			if (s[i].equals(temp)) {
				System.out.println(s[i] + "is palindrome");

			}
		}
	}
}
