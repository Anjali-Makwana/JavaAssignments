package module_2_basic;

import java.util.Scanner;

public class P11_SortArrayAscDsc {

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void sortArray(int[] array) {
		int temporary = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temporary = array[i];
					array[i] = array[j];
					array[j] = temporary;
				}
			}
		}
		System.out.println("Elements of array sorted in ascending order:");
		printArray(array);
	}

	public static void reverse(int[] array) {
		int n = array.length;
		for (int i = 0; i < n / 2; i++) {
			int temp = array[i];
			array[i] = array[n - i - 1];
			array[n - i - 1] = temp;
		}
		System.out.println("Elements of array sorted in descending order:");
		printArray(array);
	}

	public static void main(String[] args) {

		System.out.print("Enter the size of the array: ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("Enter 1 to sort array in Ascending. " + " Or 2 to sort array in Descending.");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch (i) {
		case 1:
			sortArray(array);
			break;
		case 2:
			reverse(array);
			break;
		default:
			System.out.print("no case selected");
		}
		scanner.close();
	}
}