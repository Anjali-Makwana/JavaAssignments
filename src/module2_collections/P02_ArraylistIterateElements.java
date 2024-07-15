package module2_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class P02_ArraylistIterateElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(13);
		list.add(1);
		list.add(2);
		list.add(8);
		list.add(18);
		list.add(5);
		list.add(4);
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
