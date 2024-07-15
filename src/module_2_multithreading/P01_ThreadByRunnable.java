package module_2_multithreading;

public class P01_ThreadByRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread has ended");
	}

	public static void main(String[] args) {
		P01_ThreadByRunnable th = new P01_ThreadByRunnable();
		Thread t1 = new Thread(th);
		t1.start();
		System.out.println("Hello");
	}
}
