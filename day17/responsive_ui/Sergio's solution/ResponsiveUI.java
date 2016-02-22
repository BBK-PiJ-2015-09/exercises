import java.util.*;

public class ResponsiveUI {

	public static void main(String[] args) {
		ResponsiveUI ui = new ResponsiveUI();
		ui.launch();
	}

	public void launch() {
		boolean running = true;
		CompletedTaskCollector collector = new CompletedTaskCollector();
		int taskId = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print("Delay for next task in seconds: ");
			int delay = Integer.parseInt(System.console().readLine());
			taskId++;
			Runnable task = new WaitingTask(taskId, 1000 * delay, collector);
			Thread t = new Thread(task);
			t.start();
			List<Integer> completedTaskIds = collector.getCompletedTasks();
			if (completedTaskIds.size() != 0) {
				System.out.println("Completed tasks: " + completedTaskIds);
			}
		}
	}
}
