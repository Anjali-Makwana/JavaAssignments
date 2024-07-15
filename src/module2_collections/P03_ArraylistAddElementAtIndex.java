package module2_collections;

import java.util.ArrayList;
import java.util.List;

public class P03_ArraylistAddElementAtIndex {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Yellow");
		list.add("White");
		list.add("Green");
		list.add("Black");
		
		System.out.println(list);
		list.add(1, "Orange");
		System.out.println(list);
	}	
}
