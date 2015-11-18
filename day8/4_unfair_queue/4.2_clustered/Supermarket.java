public class Supermarket {

	public void addPerson(Person person, SuperPersonQueue queue) {
		queue.insert(person);
	}

	public void servePerson(SuperPersonQueue queue) {
		queue.retrieve();
	}

}