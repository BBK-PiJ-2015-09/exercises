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
		start.bubbleSort(this);
	}

	public void cocktailSort() {
		int pass = 0;
		start.cocktailSort(this, pass);
	}

	public void print() {
		start.print();
	}
}