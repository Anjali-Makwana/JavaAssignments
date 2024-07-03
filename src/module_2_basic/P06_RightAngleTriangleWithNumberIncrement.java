package module_2_basic;

public class P06_RightAngleTriangleWithNumberIncrement {

	public static void main(String[] args) {

		int n = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(n++);
			}
			System.out.println();
		}
	}
}