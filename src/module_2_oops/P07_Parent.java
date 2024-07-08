package module_2_oops;

abstract class ParentClass {

	abstract void message();
}

class sub1 extends ParentClass {

	@Override
	void message() {
		System.out.println("This is first subclass");
	}

}

class sub2 extends ParentClass {

	@Override
	void message() {
		System.out.println("This is second subclass");
	}

}

public class P07_Parent {

	public static void main(String[] args) {
		sub1 s1 = new sub1();
		s1.message();

		sub2 s2 = new sub2();
		s2.message();
	}
}
