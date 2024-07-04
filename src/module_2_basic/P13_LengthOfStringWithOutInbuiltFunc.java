package module_2_basic;

public class P13_LengthOfStringWithOutInbuiltFunc {

	static int findLengthOfString(String s) {
		int len = 0;
		try {
			while (true) {
				s.charAt(len);
				len++;
			}
		} catch (Exception e) {
			//System.out.println(e);
		}
		return len;
	}

	public static void main(String Args[]) {
		String myString = "My name is Anjali";
		System.out.println("Length of String is " + findLengthOfString(myString));
	}
}
