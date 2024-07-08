package module_2_oops;

class Parent {

	void parent() {
		System.out.println("This is a parent class");
	}
}

public class P02_InheritanceExample extends Parent { // child class name - P02_InheritanceExample

	void child() {
		System.out.println("This is a child class");
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		p.parent();

		P02_InheritanceExample c = new P02_InheritanceExample();
		c.child();
		c.parent();
	}
}
