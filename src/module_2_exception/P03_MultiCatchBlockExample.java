package module_2_exception;

public class P03_MultiCatchBlockExample {

	public static void main(String[] args) {

		int a [] =new int [5]; 
		
		try {
			a[5]=30/5;
			System.out.println("Rest of code in try block");
		}

		catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundException) => " + e.getMessage());
		}
	}
}
