package module_2_multithreading;

public class P04_ThreadExample extends Thread {

	@Override
	public void run() {
		System.out.println("Thread has ended");
	}

	public static void main(String[] args) {
		P04_ThreadExample t1 = new P04_ThreadExample();
		t1.start();
		t1.start();
		System.out.println("Hello");
	}
}