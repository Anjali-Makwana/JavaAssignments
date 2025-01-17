package module_2_exception;

import java.util.Scanner;

class CustomException extends Exception {

	public CustomException(String str) {
		super(str);
	}

}

public class P07_CustomException {

	public static void main(String[] args) throws CustomException {

		int bankBalance = 50000;
		System.out.println("Enter amount to withdraw.");
		Scanner sc = new Scanner(System.in);

		int amountToWithdraw = sc.nextInt();
		if (amountToWithdraw > bankBalance) {
			throw new CustomException("Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.");
		} else {
			bankBalance = bankBalance - amountToWithdraw;
			System.out.println("Remaining bank balance:" + bankBalance);
		}
	}
}
