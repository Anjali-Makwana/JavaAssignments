package module_2_string;

public class P01_StringInputOperationProgram {

	public static void main(String[] args) {

		String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		count(test);
	}

	public static void count(String input) {

		char[] characters = input.toCharArray();
		int letterCount = 0;
		int spaceCount = 0;
		int numberCount = 0;
		int otherCount = 0;

		// Iterate through the character array to categorize characters
		for (char ch : characters) {
			if (Character.isLetter(ch)) {
				letterCount++;
			} else if (Character.isDigit(ch)) {
				numberCount++;
			} else if (Character.isSpaceChar(ch)) {
				spaceCount++;
			} else {
				otherCount++;
			}
		}

		// Display the original string
		System.out.println("The input string is: " + input);

		// Display the counts of letters, spaces, numbers, and other characters
		System.out.println("Letter count: " + letterCount);
		System.out.println("Space count: " + spaceCount);
		System.out.println("Number count: " + numberCount);
		System.out.println("Other character count: " + otherCount);
	}
}
