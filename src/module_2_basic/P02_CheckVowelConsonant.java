package module_2_basic;

import java.util.Scanner;

public class P02_CheckVowelConsonant {

	void findVowelOrNot(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("Entered character is Vowel");
		} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println("Entered character is Consonent");
		else
			System.err.println("Not an alphabet");
	}

	public static void main(String[] args) {

		P02_CheckVowelConsonant c = new P02_CheckVowelConsonant();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character : ");
		if (sc.next().length() > 1) {
			System.err.println("str length is greater than 1");
		} else {
			char ch = sc.next().charAt(0);
			c.findVowelOrNot(ch);
		}
		sc.close();
	}
}
