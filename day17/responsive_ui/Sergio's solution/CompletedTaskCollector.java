import java.util.*;

public class CompletedTaskCollector {
	private List<Integer> collectedTaskIds = null;

	public CompletedTaskCollector() {
		this.collectedTaskIds = new ArrayList<Integer>();
	}

	public synchronized void addCompletedTask(int taskId) {
		collectedTaskIds.add(taskId);
	}

	public List<Integer> getCompletedTasks() {
		if (collectedTaskIds.size() == 0) {
			return new ArrayList<Integer>(); // return a new object, do
		}								   // *not* share the internal
		List<Integer> result = this.collectedTaskIds;
		collectedTaskIds = new ArrayList<Integer>();
		return result;
	}

}
