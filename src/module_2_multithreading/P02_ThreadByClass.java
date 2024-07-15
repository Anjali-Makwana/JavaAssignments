package module_2_multithreading;

public class P02_ThreadByClass extends Thread {

	@Override
	public void run() {
		System.out.println("Thread has ended");
	}

	public static void main(String[] args) {
		P02_ThreadByClass t1 = new P02_ThreadByClass();
		t1.start();
		System.out.println("Hello");
	}
}