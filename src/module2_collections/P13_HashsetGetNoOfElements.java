package module2_collections;

import java.util.HashSet;

public class P13_HashsetGetNoOfElements {

	public static void main(String[] args) {

		HashSet<String> hashset = new HashSet<String>();

		hashset.add("Red");
		hashset.add("Green");
		hashset.add("Black");
		hashset.add("White");
		hashset.add("Pink");
		hashset.add("Yellow");

		System.out.println("Original Hash Set: " + hashset);
		System.out.println("Size of the Hash Set: " + hashset.size());
	}
}