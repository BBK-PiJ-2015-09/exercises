public class SuperPersonQueue implements PersonQueue {
	private OlderPersonQueue olderQueue;
	private AdultPersonQueue adultQueue;
	private ChildPersonQueue childQueue;

	public SuperPersonQueue(OlderPersonQueue olderQueue, AdultPersonQueue adultQueue, ChildPersonQueue childQueue) {
		this.olderQueue = olderQueue;
		this.adultQueue = adultQueue;
		this.childQueue = childQueue;
	}

	public void insert(Person person) {
		if (person.getAge() > 65) {
			olderQueue.insert(person);
		} else if (person.getAge() > 18) {
			adultQueue.insert(person);
		} else {
			childQueue.insert(person);
		}
	}

	public Person retrieve() {
		if (olderQueue.size() > 0) {
			return olderQueue.retrieve();
		} else if (adultQueue.size() > 0) {
			return adultQueue.retrieve();
		} else if (childQueue.size() > 0) {
			return childQueue.retrieve();
		} else {
			System.out.println("The queue is empty!");
			return null;
		}
	}

	private int size() {
		return olderQueue.size() + adultQueue.size() + childQueue.size();
	}

	public void printSize() {
		System.out.println("There are " + size() + " people in the queue!");
	}
	
}