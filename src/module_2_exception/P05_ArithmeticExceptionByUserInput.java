package module_2_exception;

import java.util.Scanner;

public class P05_ArithmeticExceptionByUserInput {

	public static void main(String[] args) {

		System.out.println("Enter numbers divsible and divisible by.");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			int div = a / b;
			System.out.println("div output " + div);
			System.out.println("Rest of code in try block");
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}
		
		sc.close();
	}
}
