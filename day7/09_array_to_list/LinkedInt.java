public class LinkedInt {
	private int value;
	private LinkedInt next;
	
	public LinkedInt(int value) {
		this.value = value;
		this.next = null;
	}

	public void addInt(LinkedInt newInt) {
		if (next == null) {
			next = newInt;
		} else {
			next.addInt(newInt);
		}
	}

	public void print() {
		System.out.println(value);
	}

	public void printList(LinkedInt linkedInt) {
		if (linkedInt.next == null) {
			linkedInt.print();
		} else {
			linkedInt.print();
			printList(linkedInt.next);
		}
	}
}