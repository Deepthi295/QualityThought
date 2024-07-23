package basics2;

public class Ex_CountRepeatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "thisisjavaseleniumclass";

		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			char c = str.charAt(i);
			if (c != '#') {
				for (int j = i + 1; j < str.length(); j++) {
					char p = str.charAt(j);
					if (c == p) {
						count = count + 1;

					}
				}
				System.out.println(c + "------------->" + count);
				str = str.replace(str.charAt(i), '#');
			}

		}

	}

}
