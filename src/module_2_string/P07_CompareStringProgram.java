package module_2_string;

public class P07_CompareStringProgram {

	public static void main(String[] args) {

		String str1 = "example.com", str2 = "Example.com";
		CharSequence cs = "example.com";

		System.out.println("Comparing " + str1 + " and " + cs + ": " + str1.contentEquals(cs));

		System.out.println("Comparing " + str2 + " and " + cs + ": " + str2.contentEquals(cs));
	}
}
