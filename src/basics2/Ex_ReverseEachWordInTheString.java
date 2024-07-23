package basics2;

public class Ex_ReverseEachWordInTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2 = "principle madam and mom are good friends";
		String[] str = s2.split(" ");

		for (int i = 0; i < str.length; i++) {
			String temp = "";
			for (int j = str[i].length() - 1; j >= 0; j--) {
				temp = temp + str[i].charAt(j);
			}
			System.out.println(temp);

		}
	}

}
