package module2_collections;

import java.util.ArrayList;

public class P17_ArraylistComparison {
	public static void main(String[] args) {

		ArrayList<String> ArrayList1 = new ArrayList<String>();
		ArrayList<String> ArrayList2 = new ArrayList<String>();

		ArrayList1.add("Element 1");
		ArrayList1.add("Element 2");
		ArrayList1.add("Element 3");
		ArrayList1.add("Element 4");

		ArrayList2.add("Element 1");
		ArrayList2.add("Element 2");
		ArrayList2.add("Element 3");
		ArrayList2.add("Element 4");

		// Display both ArrayList
		System.out.println(" ArrayList1 = " + ArrayList2);
		System.out.println(" ArrayList1 = " + ArrayList1);

		// compare ArrayList 1 with ArrayList 2
		if (ArrayList1.equals(ArrayList2) == true) {
			System.out.println(" Array List are equal");
		} else {
			System.out.println(" Array List are not equal");
		}

		System.out.println("\n Insert one more element in Array List 1");
		ArrayList1.add("Element 5");

		System.out.println(" ArrayList1 = " + ArrayList1);
		System.out.println(" ArrayList = " + ArrayList2);

		// again compare ArrayList 1 with ArrayList 2
		if (ArrayList1.equals(ArrayList2) == true) {
			System.out.println(" Array List are equal");
		} else {
			System.out.println(" Array List are not equal");
		}
	}
}
