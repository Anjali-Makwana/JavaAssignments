package module2_collections;

import java.util.ArrayList;
import java.util.Collections;

public class P18_ArraylistSwapElements {

	public static void main(String a[]) {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Item 1");
		arrayList.add("Item 2");
		arrayList.add("Item 3");
		arrayList.add("Item 4");
		arrayList.add("Item 5");

		System.out.println("Before Swap the ArrayList ");
		System.out.println(arrayList);

		// Swapping the elements at 1 and 2 indices
		Collections.swap(arrayList, 1, 2);

		System.out.println("After Swap the ArrayList");
		System.out.println(arrayList);
	}

}
