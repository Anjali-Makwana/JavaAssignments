package module2_collections;

import java.util.HashSet;

public class P11_HashsetAppendElement {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("Red");
		set.add("Green");
		set.add("Black");
		set.add("White");
		set.add("Pink");
		set.add("Yellow");

		System.out.println("The Hash Set: " + set);
	}
}
