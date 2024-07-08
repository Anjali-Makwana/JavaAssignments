package module_2_oops;

class Rectangle {

	double length;
	double width;

	void Area() {
		double area;
		area = this.length * this.width;
		System.out.println("Area of rectangle is : " + area);
	}

	void Perimeter() {
		double perimeter;
		perimeter = 2 * (this.length + this.width);
		System.out.println("Perimeter of rectangle is : " + perimeter);
	}
}

class Square {

	void Area(double side) {
		System.out.println("Area of the Square: " + side * side);
	}

	void Area(float side) {
		System.out.println("Area of the Square: " + side * side);
	}

	void Perimeter(double side) {
		double perimeter;
		perimeter = 4 * side;
		System.out.println("Perimeter of Square is : " + perimeter);
	}
}

public class P04_AreaAndPerimeterOfRectAndSquare {

	public static void main(String args[]) {
		Rectangle rect = new Rectangle();
		rect.length = 15.854;
		rect.width = 22.65;
		rect.Area();
		rect.Perimeter();

		Square square = new Square();
		square.Area(5);
		square.Perimeter(5);
	}
}