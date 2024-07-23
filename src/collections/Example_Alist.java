package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Example_Alist {
	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		System.out.println(list1.isEmpty());// the ArrayList  mainly we used to search  with in the list  
		System.out.println(list1.size());
		System.out.println(list1);
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);

		System.out.println(list1.size());
		System.out.println(list1);
		System.out.println(list1.isEmpty());
		list1.add(50);
		list1.add(60);
		list1.add(70);
		list1.add(3, 99);
		System.out.println(list1);
		list1.remove(1);
		System.out.println(list1);
		list1.add(70);
		list1.add(40);
		System.out.println(list1);

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(70);
		list2.add(30);
		list2.add(40);

		System.out.println(list2);
		System.out.println("******************************");
		System.out.println(list1.contains(70));
		System.out.println(list1.containsAll(list2));
		list1.remove(0);
		list1.removeAll(list2);
		System.out.println(list1);
		System.out.println(list1.equals(list2));
		System.out.println(list1.get(2));
		list1.add(88);
		list1.add(44);
		list1.add(90);
		System.out.println(list1);
		System.out.println(list1.size());
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("******************");
		for (Integer x : list1) {
			System.out.println(x);
		}
		System.out.println(list1.indexOf(60));
		System.out.println(list1.subList(2, 5));
		System.out.println(list1);
		System.out.println("*********&&&&&&&&&&&&&&&&&&&*************");
		System.out.println(list1);
		System.out.println(list2);
		list2.addAll(list1);
		System.out.println(list2);
		list1.addAll(2, list2);
		System.out.println(list1);
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
		Collections.sort(list2, Collections.reverseOrder());
		System.out.println(list2);

	}
}
