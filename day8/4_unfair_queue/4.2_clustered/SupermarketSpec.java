public class SupermarketSpec {
	
	public static void main(String[] args) {
		Supermarket supermarket = new Supermarket();
		OlderPersonQueue olderQueue = new OlderPersonQueue();
		AdultPersonQueue adultQueue = new AdultPersonQueue();
		ChildPersonQueue childQueue = new ChildPersonQueue();
		SuperPersonQueue queue = new SuperPersonQueue(olderQueue, adultQueue, childQueue);
		Person adult1 = new Person("adult1", 27);
		Person adult2 = new Person("adult2", 28);
		Person child1 = new Person("child1", 11);
		Person child2 = new Person("child2", 16);
		Person older1 = new Person("older1", 67);
		Person older2 = new Person("older2", 93);
		System.out.println("adult2's age is: " + adult2.getAge());
		queue.printSize();
		supermarket.addPerson(adult1, queue);
		supermarket.addPerson(adult2, queue);
		supermarket.addPerson(child1, queue);
		supermarket.addPerson(child2, queue);
		supermarket.addPerson(older1, queue);
		supermarket.addPerson(older2, queue);
		queue.printSize();
		supermarket.servePerson(queue);
		supermarket.servePerson(queue);
		supermarket.servePerson(queue);
		queue.printSize();
		supermarket.servePerson(queue);
		supermarket.servePerson(queue);
		supermarket.servePerson(queue);
		queue.printSize();
	}

}