package module_2_basic;

public class P10_SecondMaxNumInArry {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 34, 2 };

		int largest = arr[0];
		int secondLargest = arr[1];

		for (int i = 1; i < arr.length; i++) {
			if (largest < arr[i]) {
				secondLargest = largest;
				largest = arr[i];

			} else if (secondLargest < arr[i]) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Largest : " + largest);
		System.out.println("Second Largest : " + secondLargest);
	}
}
