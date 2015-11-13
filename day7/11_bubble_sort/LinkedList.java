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
			start.intAddInt(newInt);
		}
	}

	public void print() {
		start.printList(start);
	}

	public void listBubbleSort() {
		boolean swapped = false;
		int pass = 0;
		start.intBubbleSort(pass, swapped, this);
	}
}