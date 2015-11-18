public class SupermarketSpec {
	
	public static void main(String[] args) {
		Supermarket supermarket = new Supermarket();
		SuperPersonQueue queue = new SuperPersonQueue();
		Person person1 = new Person("Alex", 27);
		Person person2 = new Person("Emily", 28);
		System.out.println("Emily's age is: " + person2.getAge());
		queue.printSize();
		supermarket.addPerson(person1, queue);
		queue.printSize();
		supermarket.addPerson(person2, queue);
		queue.printSize();
		supermarket.servePerson(queue);
		queue.printSize();
		supermarket.servePerson(queue);
		queue.printSize();
	}

}