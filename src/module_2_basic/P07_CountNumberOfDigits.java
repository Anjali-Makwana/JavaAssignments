package module_2_basic;

import java.util.Scanner;

public class P07_CountNumberOfDigits {

	public static void main(String[] args) {
		
		System.out.println("Enter number less than 10 billion : ");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextLong()) {
			long n = sc.nextLong();
			if(n < 0) {
				System.err.println("number is negative.");
			} else if (n > 10000000000L) {
				System.err.println("number is greater than 10 billion.");
			} else {
				int count = 0;
				while(n!=0) {
					n = n /10;
					count++;
				}
				System.out.println(count);
			}
		}
	}
}