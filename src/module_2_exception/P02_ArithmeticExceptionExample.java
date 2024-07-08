package module_2_exception;

public class P02_ArithmeticExceptionExample {

	public static void main(String[] args) {

		try {
			int divideByZero = 10 / 0;
			System.out.println("Rest of code in try block");
		}

		catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}
	}
}
