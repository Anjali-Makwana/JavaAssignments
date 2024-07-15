package module2_collections;

import java.util.ArrayList;
import java.util.List;

public class P06_ArraylistRemoveElement {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Red");
		list.add("Yellow");
		list.add("Orange");
		list.add("White");
		list.add("Green");
		list.add("Black");

		System.out.println(list);
		list.remove("Orange");
		System.out.println("Updated list : " + list);
	}
}
