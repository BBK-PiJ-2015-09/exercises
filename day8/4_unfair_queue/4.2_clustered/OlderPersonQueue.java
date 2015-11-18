public class OlderPersonQueue implements PersonQueue {
	private Person front;

	public Person getFront() {
		return front;
	}

	public void insert(Person person) {
		System.out.println(person.getName() + " joined the queue.");
		if (front == null) {
			front = person;
		} else {
			front.getLast().setNext(person);
		}
	}

	public Person retrieve() {
		if (front == null) {
			System.out.println("The queue is empty!");
		} else {
			System.out.print("Serving " + front.getName() + "...");
			front = front.getNext();
			System.out.println(" done.");
		}
		return front;
	}

	public int size() {
		int counter = 0;
		if ( front == null ) {
			return counter;
		} else {
			return front.size(counter);
		}
	}

	public void printSize() {
		System.out.println("There are " + size() + " people in the queue!");
	}
	
}