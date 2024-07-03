package module_2_basic;

import java.util.Scanner;

public class P01_PrintGreatestNumber {
	
	public static void main(String[] args) {
	
		System.out.println("Enter three numbers");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x >= y && x >= z) {
			System.out.println("X is greatest");
		}
		else if(y >= z && y >= x) {
			System.out.println("Y is greatest");
		}
		else {
			System.out.println("Z is greatest");
		}
		sc.close();
	}
}