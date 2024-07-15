package module_2_multithreading;

public class P05_DaemonThread extends Thread {

	public void run() {

		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread executing");
		} else {
			System.out.println("user(normal) thread executing");
		}
	}

	public static void main(String[] args) {
		P05_DaemonThread t1 = new P05_DaemonThread();
		P05_DaemonThread t2 = new P05_DaemonThread();

		t1.start();
		t1.setDaemon(true);
		t2.start();
	}
}