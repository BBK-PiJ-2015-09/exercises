public class LinkedList {
	private LinkedInt start;
	
	public LinkedList() {
		start = null;
	}
	
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

	public void bubbleSort() {
		boolean swapped = false;
		start.bubbleSort(this, swapped);
	}

	public void cocktailSort() {
		boolean forward = true;
		boolean swapped = false;
		start.cocktailSort(this, forward, swapped);
	}

	public void print() {
		start.print();
	}
}