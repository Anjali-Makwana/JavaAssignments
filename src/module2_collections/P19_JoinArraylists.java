package module2_collections;

import java.util.ArrayList;

public class P19_JoinArraylists {

	public static void main(String args[]) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Java");
		list1.add("Programming");
		list1.add("Language");

		System.out.println("ArrayList 1: " + list1);

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Object");
		list2.add("Oriented");

		System.out.println("ArrayList 2: " + list2);

		list1.addAll(list2);
		System.out.println("Joined ArrayLists: " + list1);
	}
}
