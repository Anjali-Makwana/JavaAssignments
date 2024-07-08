package module_2_string;

public class P08_CheckEndContentOfString {

	public static void main(String[] args) {

		String str1 = "Java Exercises";
		String str2 = "Java Exercise";

		String endString = "se";

		boolean ends1 = str1.endsWith(endString);
		boolean ends2 = str2.endsWith(endString);

		System.out.println("\"" + str1 + "\" ends with " + "\"" + endString + "\"? " + ends1);
		System.out.println("\"" + str2 + "\" ends with " + "\"" + endString + "\"? " + ends2);
	}
}
