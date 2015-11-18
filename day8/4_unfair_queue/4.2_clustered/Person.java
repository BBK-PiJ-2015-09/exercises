public class Person {
	private String name;
	private Person next;
	private double age;
	
	public Person(String name, double age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public Person getNext() {
		return next;
	}

	public double getAge() {
		return age;
	}

	public void setNext(Person nextPerson) {
		next = nextPerson;
	}

	public void insert(Person newPerson) {
		Person person = this;
		while (newPerson.getAge() > person.getAge()) {
			person = person.next;
		}
		newPerson.next = person.getNext();
		person.next = newPerson;
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