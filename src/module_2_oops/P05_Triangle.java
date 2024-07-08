package module_2_oops;

class P05_Triangle {

	static float area(float side1, float side2, float side3) {
		if (side1 < 0 || side2 < 0 || side3 < 0 || (side1 + side2 <= side3) || (side1 + side3 <= side2)
				|| (side2 + side3 <= side1)) {
			System.out.println("Not a valid input");
			System.exit(0);
		}
		float semiPerimeter = (side1 + side2 + side3) / 2;
		float area = (float) Math
				.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
		return area;
	}

	static float perimeter(float side1, float side2, float side3) {
		float perimeter = side1 + side2 + side3;
		return perimeter;
	}

	public static void main(String[] args) {
		float side1 = 3.0f;
		float side2 = 4.0f;
		float side3 = 5.0f;
		System.out.println("Area of the triangle: " + area(side1, side2, side3));
		System.out.println("Perimeter of the triangle: " + perimeter(side1, side2, side3));

	}
}