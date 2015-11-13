public class LinkedList {
	private static LinkedInt start;

	public void addInt(int value) {
		LinkedInt newInt = new LinkedInt(value);
		if (start == null) {
			start = newInt;
		} else if (value < start.getValue()) {
			newInt.setNext(start);
			start = newInt;
		} else {
			start.addInt(newInt);
		}
	}

	public void print() {
		start.printList(start);
	}

}