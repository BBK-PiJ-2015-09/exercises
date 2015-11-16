public class SupermarketSpec {
	
	public static void main(String[] args) {
		Supermarket supermarket = new Supermarket();
		SuperPersonQueue queue = new SuperPersonQueue();
		Person person1 = new Person("Alex");
		Person person2 = new Person("Emily");
		supermarket.addPerson(person1, queue);
		supermarket.addPerson(person2, queue);
		supermarket.servePerson(queue);
		supermarket.servePerson(queue);
	}

}