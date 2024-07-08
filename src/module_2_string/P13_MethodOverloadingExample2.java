package module_2_string;

public class P13_MethodOverloadingExample2 {
	
	public static void main(String[] args) {
		
		P13_MethodOverloadingExample2 obj = new P13_MethodOverloadingExample2();
		obj.Printn(1, 'A');
		obj.Printn('B', 2);
	}

	void Printn(int n, char c) {
		System.out.println("Integer is: " + n + "\t Char is: " + c);
	}

	void Printn(char c, int n) {
		System.out.println("Char is: " + c + "\tInteger is: " + n);
	}
}