package module2_collections;

import java.util.ArrayList;
import java.util.HashSet;

public class P21_HashsetToList {
	
	public static void main(String[] args) {
		
		HashSet<String> flowerSet = new HashSet<>();
		flowerSet.add("rose");
		flowerSet.add("jasmine");
		flowerSet.add("orchid");
		flowerSet.add("marigold");

		ArrayList<String> flowerList = new ArrayList<>(flowerSet);
		System.out.println("Elements of flower ArrayList are:");
		System.out.println(flowerList);
		System.out.println("Element at index 0 is: " + flowerList.get(0));
	}
}
