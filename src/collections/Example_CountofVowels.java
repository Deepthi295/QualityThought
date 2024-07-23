package collections;

import java.util.HashMap;

public class Example_CountofVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "wearestaringseleniumclassesfromtromorrow";
		char[] vowels = {'a','e','i','o','u'};
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		 for(int i = 0;i <str.length();i++) {
			 int count = 0 ;
			 for(int j = i+1;j<=str.charAt(j);j++) {
				 if(vowels[i]==str.charAt(j)) {
					 count = count+1;
				 }
				// str = str.replace(str.charAt(j), '# ');
			 }
			 map1.put(vowels[i], count);
		 }
		 System.out.println();
	}

}
