public class LinkedInt {
	private int value;
	private LinkedInt next;
	
	public LinkedInt(int value) {
		this.value = value;
		this.next = null;
	}

	public int getValue() {
		return value;
	}

	public LinkedInt getNext() {
		return next;
	}
	
	public void setNext(LinkedInt newInt) {
		next = newInt;
	}

	public void addInt(LinkedInt newInt) {
		if (next == null) {
			next = newInt;
		} else if (newInt.getValue() < next.getValue()) {
			newInt.setNext(next);
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