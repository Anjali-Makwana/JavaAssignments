package module2_collections;

import java.util.HashMap;

public class P22_CheckHashmapContainsKeyValue {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Red");
		hashMap.put(2, "Green");
		hashMap.put(3, "Black");
		hashMap.put(4, "White");
		hashMap.put(5, "Blue");

		boolean result = hashMap.isEmpty();
		System.out.println("Is the hash map empty: " + result);

		// Removing all elements from the map
		hashMap.clear();

		// Check if the map is empty after clearing
		result = hashMap.isEmpty();
		System.out.println("Is the hash map empty: " + result);
	}
}
