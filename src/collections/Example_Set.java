package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Example_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set1 = new HashSet<Integer>();
		System.out.println(set1.isEmpty());// hash set wont accept the duplicate values
		System.out.println(set1.size());
		System.out.println(set1);
		set1.add(10);
		set1.add(30);
		set1.add(90);
		set1.add(200);
		set1.add(90);
		set1.add(10);
		System.out.println(set1);
		set1.clear();
		System.out.println(set1);
		set1.remove(10);
		System.out.println(set1);
		System.out.println(set1.contains(200));
		for (Integer value : set1) {
			System.out.println(value);
		}
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(10);
		set2.add(30);
		set2.add(90);
		set2.add(200);
		set2.add(88);
		set2.add(90);
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set1.contains(set2));
		System.out.println(set1.equals(set2));
		set1.add(10);
		set1.removeAll(set2);
		System.out.println(set1);

		LinkedHashSet<Integer> lset1 = new LinkedHashSet<Integer>();
		lset1.add(90);
		lset1.add(330);
		lset1.add(44);
		lset1.add(22);
		lset1.add(88);
		lset1.add(53);
		lset1.add(22);

		System.out.println(lset1);
		System.out.println(lset1.size());

		System.out.println("****************************");
		List<Integer> sortedList = new ArrayList<Integer>(lset1);
		System.out.println(sortedList);
		Collections.sort(sortedList);
		System.out.println(sortedList);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		TreeSet<Integer> tset1 = new TreeSet<Integer>();
		tset1.add(90);
		tset1.add(33);
		tset1.add(44);
		tset1.add(22);
		tset1.add(88);
		tset1.add(53);
		tset1.add(22);

		System.out.println(tset1);
		System.out.println(lset1);

		TreeSet<Integer> tset2 = new TreeSet<Integer>(lset1);
		System.out.println(tset2);

		TreeSet<Integer> tset3 = new TreeSet<Integer>();
		tset3.add(90);
		tset3.add(33);
		tset3.add(44);
		tset3.add(22);
		tset3.add(53);
		tset3.add(22);
		System.out.println(tset3);

		TreeSet<Integer> reverseSet = (TreeSet<Integer>) tset2.descendingSet();
		System.out.println(reverseSet);

	}
}