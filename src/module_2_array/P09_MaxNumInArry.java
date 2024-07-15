package module_2_array;

import java.util.Arrays;

public class P09_MaxNumInArry {

	static int maxNumInArray() {

		int arr[] = { 10, 2, 71, 168, 11 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		return max;

	}

	public static void main(String[] args) {

		System.out.println("Maximum number in array is :" + maxNumInArray());
		
		//2nd way - java 8 stream
		int arry[] = { 10, 2, 71, 168, 115, 798, 10};
		int max = Arrays.stream(arry).max().getAsInt();
		System.out.println("max num in arry "+max);
		
		//3rd - predefined function
		Arrays.sort(arry);
		System.out.println("Max by collection function : "+arry[arry.length-1]);
	}
}
