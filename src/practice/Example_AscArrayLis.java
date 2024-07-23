package practice;

import java.util.ArrayList;

public class Example_AscArrayLis {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();

		System.out.println(list1.isEmpty());
		System.out.println(list1.size());
		list1.add(10);
		list1.add(30);
		list1.add(99);
		list1.add(50);
		list1.add(60);
		list1.add(11);
		list1.add(44);
		list1.add(90);
		System.out.println(list1);
		for (int i = 0; i < list1.size(); i++) {
			int asc = 0;
			for (int j = i + 1; j < list1.size(); j++) {
				if (list1.get(i) > list1.get(j)) {
					asc = list1.get(i);
					list1.set(i, list1.get(j));
					list1.set(j, asc);

				}
			}
		}

		for (int k = 0; k < list1.size(); k++) {
			System.out.println(list1.get(k));
		}
	}
}
