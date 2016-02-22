/**
 * A task that just waits
 */
public class WaitingTask implements Runnable {
	private int taskId;
	private int delay;

	public WaitingTask(int taskId, int delay) {
		this.taskId = taskId;
		this.delay = delay;
	}

	public void run() {
		try {
			System.out.println(this.delay);
			Thread.sleep(this.delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
