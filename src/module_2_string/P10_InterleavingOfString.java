package module_2_string;

public class P10_InterleavingOfString {

	static void printInterLeaving(String s1, int i, String s2, int j, String asf) {
		if (i == s1.length() && j == s2.length()) {
			System.out.println(asf);
		}

		if (i < s1.length())
			printInterLeaving(s1, i + 1, s2, j, asf + s1.charAt(i));

		if (j < s2.length())
			printInterLeaving(s1, i, s2, j + 1, asf + s2.charAt(j));
	}

	public static void main(String[] args) {
		String s1 = "WX";
		String s2 = "YZ";
		printInterLeaving(s1, 0, s2, 0, "");
	}
}
//YWZX WYZX YWXZ WXYZ YZWX WYXZ
