package module_2_oops;

class Complex {

	int real, imaginary;

	Complex() {
	}

	Complex(int tempReal, int tempImaginary) {
		real = tempReal;
		imaginary = tempImaginary;
	}

	Complex addComp(Complex C1, Complex C2) {
		Complex temp = new Complex();
		temp.real = C1.real + C2.real;
		temp.imaginary = C1.imaginary + C2.imaginary;
		return temp;
	}

	Complex subtractComp(Complex C1, Complex C2) {
		Complex temp = new Complex();

		temp.real = C1.real - C2.real;
		temp.imaginary = C1.imaginary - C2.imaginary;
		return temp;
	}

	Complex productComp(Complex a, Complex b) {
		return new Complex(((a.real * b.real) - (a.imaginary * b.imaginary)),
				((a.real * b.imaginary) + (a.imaginary * b.real)));
	}

	void printComplexNumber() {
		System.out.println("Complex number: " + real + " + " + imaginary + "i");
	}
}

public class P06_Complex {

	public static void main(String[] args) {

		Complex C1 = new Complex(3, 2);
		C1.printComplexNumber();

		Complex C2 = new Complex(9, 5);
		C2.printComplexNumber();

		Complex C3 = new Complex();
		C3 = C3.addComp(C1, C2);
		System.out.print("Sum of ");
		C3.printComplexNumber();

		C3 = C3.subtractComp(C1, C2);
		System.out.print("Difference of ");
		C3.printComplexNumber();
		
		Complex C4 = new Complex();
		System.out.print("Product of ");
		C4 = C4.productComp(C1, C2);
		C4.printComplexNumber();
	}
}
