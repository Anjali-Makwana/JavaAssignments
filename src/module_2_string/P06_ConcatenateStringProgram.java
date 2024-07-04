package module_2_string;

public class P06_ConcatenateStringProgram {

	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = "Programming";

		System.out.println("String 1: " + str1);
		System.out.println("String 2: " + str2);

		String str3 = str1.concat(str2);
		System.out.println("The concatenated string: " + str3);
	}
}
