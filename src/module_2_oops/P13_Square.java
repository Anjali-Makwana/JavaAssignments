package module_2_oops;

class Shapee {
	
	void printShape() {
		System.out.println("This is shape");
	}
}

class Rectanglee extends Shapee {

	void printRectangle() {
		System.out.println("This is Rectangle");
	}
}

class Circle extends Shapee{
	
	void printCircle() {
		System.out.println("This is Circle");
	}
}

class P13_Square extends Rectanglee{
	
	void printSquareRectangle() {
		System.out.println("Square is a rectangle");
	}
	
	public static void main(String[] args) {
		P13_Square s = new P13_Square();
		s.printShape();
		s.printRectangle();
	}
}