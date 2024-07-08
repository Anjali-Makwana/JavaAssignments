package module_2_exception;

public class P01_TryCatchExample {

	public static void main(String[] args) {

		try {
			System.out.println("In try block");
		}

		catch (Exception e) {
			System.out.println("Exception => " + e.getMessage());
		}
	}
}