public class SuperPersonQueue implements PersonQueue {
	private Person front;

	public void insert(Person person) {
		System.out.println(person.getName() + " joined the queue.");
		if (front == null) {
			front = person;
		} else if (person.getAge() > front.getAge()) {
			person.setNext(front);
			front = person;
		} else {
			front.insert(person);
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

	private int size() {
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