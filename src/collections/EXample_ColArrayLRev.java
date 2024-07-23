package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EXample_ColArrayLRev { // with and with out using reverse method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(90);
		list1.add(33);
		list1.add(44);
		list1.add(22);
		list1.add(88);
		list1.add(53);
		list1.add(22);
		list1.add(76);
		list1.add(55);
		list1.add(33);
		list1.add(56);
		list1.add(55);

		//System.out.println(list1);
		System.out.println("****************************");

		Collections.reverse(list1);;

		System.out.println(list1);
		
		/*
		 * for (int i = list1.size() - 1; i >= 0; i--) {
		 * System.out.println(list1.get(i));
		 * 
		 * }
		 */
		 
	}

}
