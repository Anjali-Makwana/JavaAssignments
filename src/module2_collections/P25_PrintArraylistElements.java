package module2_collections;

import java.util.ArrayList;

public class P25_PrintArraylistElements {

	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Red");
		myList.add("Green");
		myList.add("Black");
		myList.add("White");
		myList.add("Pink");

		System.out.println("Original array list: " + myList);
		
		System.out.println("Print using index of an element:");
		for (int index = 0; index < myList.size(); index++) {
			System.out.println(myList.get(index));
		}
	}
}
