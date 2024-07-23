package collections;

import java.util.HashMap;

public class Example_HmapPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "wearestatingseleniumclassfromtomorrow";
		HashMap<Character,String > map1 = new HashMap<Character, String>();
		for(int i = 0;i<str.length();i++) {
			int count = 1;
			if(str.charAt(i)!= '#') {
			for(int j =i+1;j<str.length();j++) {	
				if(str.charAt(i)==str.charAt(j)) {
					count = count+1;
				}
			}
			if(count>=2) {
				//map1.put(str.charAt(i),count);
			}
			str=str.replace(str.charAt(i),'#');
		}
			
		}
		System.out.println(map1);
	}

}
