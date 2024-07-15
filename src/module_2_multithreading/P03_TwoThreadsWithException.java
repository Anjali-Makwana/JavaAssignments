package module_2_multithreading;

class Counter {
	private int count;

	Counter(int count) {
		this.count = count;
	}

	public void countMe() throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
			System.out.println("thread : " + count + " iteration : " + i);
			Thread.sleep(500);
		}
	}
}

class ByThreadClass extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(" iteration by thread class : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ByRunnableInterface extends Object implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(" iteration by runnable interface : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class P03_TwoThreadsWithException {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread();
		System.out.println(t.currentThread());
		t.setName("MyThread");
		System.out.println(t);
		long startTime = System.currentTimeMillis();
		Counter c = new Counter(1);
		c.countMe();
		System.out.println("*********************");
		Counter c1 = new Counter(2);
		c1.countMe();
		long endTime = System.currentTimeMillis();
		System.out.println("total time to execute thread is : " + (endTime - startTime));

		ByThreadClass b = new ByThreadClass();
		b.run();

		ByRunnableInterface r = new ByRunnableInterface();
		r.run();
	}
}