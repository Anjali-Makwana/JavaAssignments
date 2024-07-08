package module_2_exception;

import java.util.Scanner;

public class P06_ValidateAgeToVoteExample {

	public static void main(String[] args) {

		System.out.println("Enter your age.");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age < 18) {
			throw new ArithmeticException("Ineligible to vote.");
		} else {
			System.out.println("Welcome to vote.");
		}
	}
}
