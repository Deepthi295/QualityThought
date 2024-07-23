package collections;

import java.util.ArrayList;

public class Example_arralisRemDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		System.out.println(list1.isEmpty());
		System.out.println(list1.size());
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

		System.out.println(list1);

		for (int i = 0; i <= list1.size(); i++) {
			int count = 1;
			System.out.println(count);

			for (int j = i + 1; j <= list1.size(); i++) {
				if (list1.get(i).equals(list1.get(j))) {
					list1.remove(j);
					j--;
				}

			}

		}

		System.out.println(list1);
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i).equals(33)) {
				list1.set(i, 11);

			}
		}

	}

}
