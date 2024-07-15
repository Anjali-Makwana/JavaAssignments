package module2_collections;

import java.util.HashMap;

public class P14_MapCountElements {
	
	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Red");
		map.put(2, "Green");
		map.put(3, "Black");
		map.put(4, "White");
		map.put(5, "Blue");

		System.out.println("Size of the hash map: " + map.size());
	}
}