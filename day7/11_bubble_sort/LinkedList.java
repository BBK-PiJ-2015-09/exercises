public class LinkedList {
	private LinkedInt start;

	public LinkedInt getStart() {
		return start;
	}
	
	public void setStart(LinkedInt newStart) {
		start = newStart;
	}
	
	public void addInt(int value) {
		LinkedInt newInt = new LinkedInt(value);
		if (start == null) {
			start = newInt;
		} else {
			start.addInt(newInt);
		}
	}

	public void print() {
		start.printList(start);
	}

	public LinkedList bubbleSort() {
		boolean swapped = false;
		int pass = 0;
		start.bubbleSort(pass, swapped, this);
		return this;
	}
}