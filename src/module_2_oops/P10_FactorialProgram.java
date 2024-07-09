package module_2_oops;

public class P10_FactorialProgram {

	public static void main(String[] args) {

		int n = 5;
		System.out.println("Factorial of " + n+" is " + factorial(n));

	}

	static int factorial(int n) {

		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}