package module_2_basic;

import java.util.Scanner;

public class P04_FindSumAndAverageUsingForLoop {

	public static void main(String[] args) {
		
		System.out.println("Enter five numbers :");
		Scanner sc = new Scanner(System.in);
		
		int n = 5;
		int sum = 0;
		
		for(int i =0;i<n;i++) {
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println("their sum"+sum);
		System.out.println("their average"+sum/n);
		sc.close();		
	}
}
