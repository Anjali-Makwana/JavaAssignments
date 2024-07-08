package module_2_exception;

public class P04_NestedTryCatchExample {

	public static void main(String[] args) {
		try {
			// Outer try block
			int a[] = { 1, 2, 3, 4, 5 };
			System.out.println(a[5]); // Accessing element at index 5
			try {
				// Inner try block
				int result = 10 / 0; 
				System.out.println("Result: " + result);
			} catch (ArithmeticException innerException) {
				// Inner catch block
				System.err.println("An arithmetic error occurred: " + innerException.getMessage());
			}
		} catch (ArrayIndexOutOfBoundsException outerException) {
			// Outer catch block
			System.err.println("An error occurred: " + outerException.getMessage());
		}
	}
}
