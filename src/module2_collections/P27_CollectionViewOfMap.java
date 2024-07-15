package module2_collections;

import java.util.*;

public class P27_CollectionViewOfMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hash_map = new HashMap<>();
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");

		// Get the collection view of the map values
		Collection<String> values = hash_map.values();

		System.out.println("Collection view is: " + values);
	}
}
