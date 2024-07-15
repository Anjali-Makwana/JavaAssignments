package module2_collections;

import java.util.ArrayList;

class P15_ArraylistReverseElements {
	public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist) {
		ArrayList<Integer> revArrayList = new ArrayList<Integer>();
		for (int i = alist.size() - 1; i >= 0; i--) {
			revArrayList.add(alist.get(i));
		}
		return revArrayList;
	}

	public void printElements(ArrayList<Integer> alist) {
		for (int i = 0; i < alist.size(); i++) {
			System.out.print(alist.get(i) + " ");
		}
	}

	public static void main(String[] args) {
		P15_ArraylistReverseElements obj = new P15_ArraylistReverseElements();
		ArrayList<Integer> arrayli = new ArrayList<Integer>();
		arrayli.add(1);
		arrayli.add(2);
		arrayli.add(3);
		arrayli.add(4);

		System.out.print("Elements before reversing: ");
		obj.printElements(arrayli);

		arrayli = obj.reverseArrayList(arrayli);

		System.out.print("\nElements after reversing: ");
		obj.printElements(arrayli);
	}
}
