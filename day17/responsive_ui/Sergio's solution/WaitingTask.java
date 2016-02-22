/**
 * A task that just waits
 */
public class WaitingTask implements Runnable {
	private int taskId;
	private int delay;
	private CompletedTaskCollector collector;

	public WaitingTask(int taskId, int delay, CompletedTaskCollector collector) {
		this.taskId = taskId;
		this.delay = delay;
		this.collector = collector;
	}

	public void run() {
		try {
			System.out.println(this.delay);
			Thread.sleep(this.delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		collector.addCompletedTask(taskId);
	}

}
