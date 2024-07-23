package collections;

import java.util.ArrayList;

public class Example_ArrayStriRem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stri1 = new ArrayList<String>();
		System.out.println(stri1.isEmpty());
		System.out.println(stri1.size());
		stri1.add(0, "java");
		stri1.add(1, "selenium");
		stri1.add(2, "class");
		stri1.add(3, "at");
		stri1.add(4, "quality");
		stri1.add(5, "thought");

		System.out.println(stri1);
		stri1.remove(2);
		System.out.println(stri1);
		stri1.add(2, "class");
		System.out.println(stri1.subList(1, 5));

	}

}
