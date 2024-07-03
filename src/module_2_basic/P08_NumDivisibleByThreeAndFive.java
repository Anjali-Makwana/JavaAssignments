package module_2_basic;

public class P08_NumDivisibleByThreeAndFive {

	public static void main(String[] args) {

		System.out.println("numbers divisible by 3 :");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i+" ");
			}
		}

		System.out.println("\nnumbers divisible by 5 :");
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0) {
				System.out.print(i+" ");
			}
		}

		System.out.println("\nnumbers divisible by 3 and 5 :");
		for (int i = 1; i < 100; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i+" ");
			}
		}

	}
}
