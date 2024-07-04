package module_2_string;

import java.util.Scanner;

public class P02_PrintAsciiValueOfChar {

	public static void main(String[] args) {

		System.out.println("Enter character :");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int asciivalue1 = ch;
		System.out.println("The ASCII value of " + ch + " is: " + asciivalue1);
		sc.close();
	}
}
