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
	
	public void insert(Person person) {
		if (next == null) {
			next = person;
		} else {
			next.insert(person);
		}
	}
	
	public int size(int counter) {
		if ( next == null ) {
			counter++;
			return counter;
		} else {
			counter++;
			return next.size(counter);
		}
	}
}