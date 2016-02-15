public class Increaser implements Runnable {
	private Counter c;

	public Increaser(Counter counter) {
		this.c = counter;
	}

	public static void main(String args[]) {
		System.out.println("Create counter");
		Counter counter = new Counter();
		System.out.println("Begin thread creation loop:");
		for (int i = 0; i < 100; i++) {
			System.out.println("Create increaser " + i);
			Increaser increaserTask = new Increaser(counter);
			System.out.println("Create thread for increaser " + i);
			Thread t = new Thread(increaserTask);
			System.out.println("Start thread for increaser " + i);
			t.start();
		}
	}

	public void run() {
		System.out.println("Starting an increase loop");
		System.out.println("Starting at " + c.getCount());
		for (int i = 0; i < 1000; i++) {
			c.increase();
		}
		System.out.println("Stopping at " + c.getCount());
	}
}
