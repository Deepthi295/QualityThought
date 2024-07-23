package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Example_MapHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
		System.out.println(hmap1.isEmpty());
		System.out.println(hmap1.size());
		hmap1.put(101, "suresh");
		hmap1.put(102, "ramesh");
		hmap1.put(103, "varum");
		hmap1.put(104, "prasad");
		hmap1.put(105, "karan");
		hmap1.put(null, "Null value");
		hmap1.put(104, "RamaRao");
		hmap1.put(107, null); 
		hmap1.put(106, null);
		System.out.println("**************************");
		System.out.println(hmap1.isEmpty());
		System.out.println(hmap1.size());
		System.out.println(hmap1);

		System.out.println(hmap1.containsKey(106));
		System.out.println(hmap1.containsValue("asdfghjk"));
		hmap1.remove(104);
		System.out.println(hmap1);
		hmap1.replace(105, "arjun");
		System.out.println(hmap1);
		hmap1.replace(107, null, "prasad");
		System.out.println(hmap1);

		HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
		hmap2.put(109, "Rajesh");
		hmap2.putAll(hmap1);
		System.out.println(hmap2);
		System.out.println(hmap2.size());
		System.out.println("***************************************");

//		 for (Entry<Integer, String> entry :hmap2.entrySet()) {
//			System.out.println(entry);

		// }
		System.out.println("****************************************");
		for (Integer value : hmap1.keySet()) {
			System.out.println(value);
		}
		System.out.println("********************************");
		for (String value : hmap1.values()) {
			System.out.println(value);
		}
		System.out.println(hmap1.equals(hmap2));

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");

		LinkedHashMap<Integer, String> lmap1 = new LinkedHashMap<Integer, String>(hmap1);
		lmap1.put(101, "suresh");
		lmap1.put(102, "ramesh");
		lmap1.put(103, "varum");
		lmap1.put(104, "prasad");
		lmap1.put(105, "karan");
		lmap1.put(null, "nullvalue");
		lmap1.put(104, "RamaRao");
		lmap1.put(107, null);
		lmap1.put(106, null);
		System.out.println("**************************************");
		System.out.println(lmap1.size());
		System.out.println(lmap1.isEmpty());
		System.out.println(lmap1);

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		TreeMap<Integer, String> tmap1 = new TreeMap<Integer, String>();
		tmap1.put(101, "suresh");
		tmap1.put(102, "ramesh");
		tmap1.put(106, null);
		tmap1.put(103, "varum");
		tmap1.put(104, "prasad");
		tmap1.put(105, "karan");
		tmap1.put(null, "nullvalue");
		tmap1.put(104, "RamaRao");
		tmap1.put(107, null);
		System.out.println(tmap1.size());
		System.out.println(tmap1.isEmpty());
		System.out.println(tmap1);

	}

}
