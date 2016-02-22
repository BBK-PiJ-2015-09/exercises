public class Responsive implements Runnable {
	private Integer duration;
	private Integer number;
	private static Thread[] threads;

	public Responsive(int duration, int number) {
		this.duration = duration;
		this.number = number;
	}

	public static void main(String[] args) {
		threads = new Thread[10];

		for(int i = 0; i < 10; i++) {
			System.out.print("Enter the duration (in ms) of task " + i + ": ");
			String duration = System.console().readLine();
			Integer durationInt = Integer.parseInt(duration);
			startThread(durationInt, i);
			String feedback = "";
			for(int j = 0; j < threads.length; j++){
				if ( (threads[j]!= null) && !threads[j].isAlive() ) {
					feedback = feedback + j + ", ";
					threads[j] = null;
				}
			}
			if (feedback != "") {
				System.out.println("Completed the following jobs: " + feedback);
			}
		}
	}

	public void run() {
		try {
			Thread.sleep(duration); // sleep 1000ms = 1 second
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	public static void startThread(Integer duration, Integer count) {
		Responsive responsive = new Responsive(duration, count);
		Thread thread = new Thread(responsive);
		thread.start();
		threads[count] = thread;
	}

}