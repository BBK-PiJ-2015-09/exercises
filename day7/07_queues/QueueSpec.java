public class QueueSpec {
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.printSize();
		queue.insert(5);
		queue.insert(8);
		queue.insert(12);
		queue.printSize();
		queue.retrieve();
		queue.insert(13);
		queue.printSize();
		queue.retrieve();
		queue.retrieve();
		queue.printSize();
		queue.retrieve();
	}
}