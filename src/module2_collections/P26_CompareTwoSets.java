package module2_collections;

import java.util.*;

public class P26_CompareTwoSets {
	public static void main(String[] args) {

		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();

		set1.add("Red");
		set1.add("Green");
		set1.add("Black");
		set1.add("White");

		set2.add("Red");
		set2.add("Pink");
		set2.add("Black");
		set2.add("Orange");

		// Retain elements that are the same in both sets
		set1.retainAll(set2);

		System.out.println("Common elements: " + set1);
	}
}
