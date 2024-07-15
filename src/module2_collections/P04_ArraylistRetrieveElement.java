package module2_collections;

import java.util.ArrayList;
import java.util.List;

public class P04_ArraylistRetrieveElement {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Red");
		list.add("Yellow");
		list.add("White");
		list.add("Green");
		list.add("Black");

		System.out.println(list);
		String element = list.get(3);
		System.out.println("Retrieved element at index 3 " + element);
	}
}
