package module_2_oops;

abstract class Marks {

	public abstract float getPercentage();

}

class A extends Marks {

	int marks1, marks2, marks3;

	public A(int marks1, int marks2, int marks3) {
		super();
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	@Override
	public float getPercentage() {
		float total = ((marks1 + marks2 + marks3) / (float) 300) * 100;
		return total;
	}

}

class B extends Marks {

	int marks1, marks2, marks3, marks4;

	public B(int marks1, int marks2, int marks3, int marks4) {
		super();
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.marks4 = marks4;
	}

	public float getPercentage() {
		float total = ((marks1 + marks2 + marks3 + marks4) / (float) 400) * 100;
		return total;
	}

}

public class P09_Marks {

	public static void main(String[] args) {

		A a = new A(59, 35, 100);
		B b = new B(94, 53, 34, 54);
		System.out.println(a.getPercentage());
		System.out.println(b.getPercentage());

	}
}
