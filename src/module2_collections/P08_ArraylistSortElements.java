package module2_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P08_ArraylistSortElements {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Red");
		list.add("Yellow");
		list.add("Orange");
		list.add("White");
		list.add("Green");
		list.add("Black");

		System.out.println("Before Sorting: " + list);
		Collections.sort(list);
		System.out.println("After Sorting: " + list);
	}
}
