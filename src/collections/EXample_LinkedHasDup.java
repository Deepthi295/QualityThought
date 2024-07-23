package collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class EXample_LinkedHasDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lset1 = new ArrayList<Integer>();
		lset1.add(90);
		lset1.add(33);
		lset1.add(44);
		lset1.add(22);
		lset1.add(88);
		lset1.add(53);
		lset1.add(22);
		lset1.add(76);
		lset1.add(55);
		lset1.add(33);
		lset1.add(56);
		lset1.add(55);

//		System.out.println(lset1);
//		System.out.println("**********************************");
	LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>(lset1);
		System.out.println(lset1);
		System.out.println(lhset);
	}
}
