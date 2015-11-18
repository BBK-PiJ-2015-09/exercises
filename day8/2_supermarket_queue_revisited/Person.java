public class Person {
	private String name;
	private Person next;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Person getNext() {
		return next;
	}

	public void setNext(Person nextPerson) {
		next = nextPerson;
	}

	public Person getLast() {
		Person person = this;
		while (person.next != null) {
			person = person.next;
		}
		return person;
	}

	public int size(int counter) {
		Person person = this;
		counter++;
		while (person.next != null) {
			counter++;
			person = person.next;
		}
		return counter;
	}
}