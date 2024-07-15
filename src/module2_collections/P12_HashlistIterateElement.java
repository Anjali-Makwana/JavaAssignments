package module2_collections;

import java.util.HashSet;
import java.util.Iterator;

public class P12_HashlistIterateElement {
	
	public static void main(String[] args) {

		HashSet<String> hashset = new HashSet<String>();

		hashset.add("Red");
		hashset.add("Green");
		hashset.add("Black");
		hashset.add("White");
		hashset.add("Pink");
		hashset.add("Yellow");

		Iterator<String> iterator = hashset.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}