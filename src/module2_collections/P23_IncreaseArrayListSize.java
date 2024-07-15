package module2_collections;

import java.util.ArrayList;

public class P23_IncreaseArrayListSize {
	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<>(3);
		myList.add("Apple");
		myList.add("Banana");
		myList.add("Cherry");

		System.out.println("Original ArrayList: " + myList);

		// Increase the capacity to hold at least 6 elements
		myList.ensureCapacity(6);

		myList.add("Date");
		myList.add("Fig");
		myList.add("Grapes");
		System.out.println("Updated ArrayList: " + myList);
	}
}
