package collections;

import java.util.ArrayList;

public class Example_CreArrLi {

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

//		System.out.println(list1);
//		System.out.println(list1.subList(4, 10));//sublist of given Arraylist

//		list1.remove(3); // removing specific index values from the array list
//		list1.remove(5);
		System.out.println(list1);
		
		for(int i = 0 ; i<list1.size();i++) {
			if(list1.get(i).equals(22)) {
				list1.remove(i);
				break;
			}
		}
		System.out.println(list1);

//		for (int i = 0; i < list1.size(); i++) { // printing the elements by using for loop
//			System.out.print("   " + list1.get(i));
//		}
//		for (Integer x : list1) { // printing the elements by using for each loop
//			System.out.println("  " + x);
//
//		}
		
	}

}
