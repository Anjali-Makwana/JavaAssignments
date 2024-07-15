package module2_collections;

import java.util.ArrayList;
import java.util.List;

public class P07_ArraylistSearchElement {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Red");
		list.add("Yellow");
		list.add("Orange");
		list.add("White");
		list.add("Green");
		list.add("Black");

		System.out.println(list);

		String searchElement = "Green";
		boolean found = list.contains(searchElement);

		if (found) {
			System.out.println("Element found in the list.");
		} else {
			System.out.println("Element not found in the list.");
		}
	}
}
