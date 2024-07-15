package module2_collections;

import java.util.ArrayList;

public class P09_ArraylistCopyElements {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(12);
		list.add(5);
		list.add(10);
		list.add(57);
		list.add(4);
		list.add(1);

		System.out.println(list);

		// ArrayList<Integer> list2 = list;
		ArrayList<Integer> list2 = new ArrayList<>(list);
		System.out.println(list2);
	}
}
