package module_2_oops;

import java.util.Scanner;

abstract class Shape {

	public abstract void rectangleArea(double length, double breadth);
	public abstract void squareArea(double side);
	public abstract void circleArea(double radius);

}

class Area extends Shape {

	@Override
	public void rectangleArea(double length, double breadth) {
		System.out.printf("Rectangle area = %.2f", length * breadth);
		System.out.println("");
	}

	@Override
	public void squareArea(double side) {
		System.out.printf("Square area = %.2f", side * side);
		System.out.println("");
	}

	@Override
	public void circleArea(double radius) {
		System.out.printf("Circle area = %.2f", Math.PI * radius * radius);
		System.out.println("");
	}

}

public class P11_FindArea {

	public static void main(String[] args) {
		Area area = new Area();
		Scanner in = new Scanner(System.in);

		System.out.print("Enter length for rectangle: ");
		double len = in.nextDouble();
		System.out.print("Enter breadth for rectangle: ");
		double bre = in.nextDouble();
		area.rectangleArea(len, bre);

		System.out.print("Enter breadth for square: ");
		double sid = in.nextDouble();
		area.squareArea(sid);

		System.out.print("Enter breadth for circle: ");
		double rad = in.nextDouble();
		area.circleArea(rad);
	}
}
