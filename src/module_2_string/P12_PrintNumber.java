package module_2_string;

public class P12_PrintNumber {

	void printn(int a) {
		System.out.println("Integer: " + a);
	}

	void printn(float a) {
		System.out.println("float: " + a);
	}

	void printn(String a) {
		System.out.println("String: " + a);
	}

	void printn(char a) {
		System.out.println("Char: " + a);
	}

	void printn(double a) {
		System.out.println("Double: " + a);
	}

	public static void main(String[] args) {
		P12_PrintNumber obj = new P12_PrintNumber();
		obj.printn(10);
		obj.printn(2.5);
		obj.printn("Anjali");
		obj.printn('A');
		obj.printn(13.5);
	}
}