public class Queue {
	private QueuedInt front;

	public void insert(int value) {
		System.out.println("Inserting request " + value + "...");
		QueuedInt newInt = new QueuedInt(value);
		if (front == null) {
			front = newInt;
		} else {
			front.insert(newInt);
		}
	}

	public QueuedInt retrieve() {
		if (front == null) {
			System.out.println("The queue is empty!");
		} else {
			System.out.print("Retrieving request " + front.getValue() + "...");
			front = front.getNext();
			System.out.println(" done.");
		}
		return front;
	}
	
	private int size() {
		int counter = 0;
		if ( front == null ) {
			return counter;
		} else {
			return front.size(counter);
		}
	}

	public void printSize() {
		System.out.println("There are " + size() + " requests in the queue.");
	}
}