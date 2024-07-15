package module2_collections;

import java.util.ArrayList;
import java.util.List;

public class P05_ArraylistUpdateElement {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Red");
		list.add("Yellow");
		list.add("White");
		list.add("Green");
		list.add("Black");

		System.out.println(list);
		list.set(4, "Blue");
		System.out.println("Updated list : " + list);
	}
}
