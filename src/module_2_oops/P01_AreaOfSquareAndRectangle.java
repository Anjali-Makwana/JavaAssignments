package module_2_oops;

public class P01_AreaOfSquareAndRectangle {

	void areaOfCircle(int a) {
		System.out.println("Area of Square " + a * a);
	}

	void areaOfRectangle(int l, int b) {
		System.out.println("Area of Rectangle " + l * b);
	}

	public static void main(String[] args) {
		P01_AreaOfSquareAndRectangle area = new P01_AreaOfSquareAndRectangle();
		area.areaOfCircle(5);
		area.areaOfRectangle(10, 5);
	}
}
