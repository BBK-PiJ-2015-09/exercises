public class LinkedInt {
	private int value;
	private LinkedInt next;
	private LinkedInt last;
	private static boolean swapped;
	private static LinkedInt start;
	
	public LinkedInt(int value) {
		this.value = value;
		this.next = null;
		this.last = null;
		this.swapped = false;
	}

	public void bubbleSort() {
		if (endOfList()) {
			if (swapped) {
				unswapped();
				start.bubbleSort();
			}
		}  else if (value > next.getValue()) {
			if (startOfList()) {
				start = next;
			}
			swapNext();
			this.bubbleSort();
		} else {
			next.bubbleSort();
		}
	}

	// LinkedList
	
	public void addInt(int value) {
		LinkedInt newInt = new LinkedInt(value);
		if (getStart() == null) {
			setStart(newInt);
		} else {
			getStart().linkInt(newInt);
		}
	}
	
	public static LinkedInt getStart() {
		return start;
	}
	
	public void printList() {
		start.print();
	}

	private static void setStart(LinkedInt newStart) {
		start = newStart;
	}

////////////
	
	private void unswapped() {
		swapped = false;
	}
	
	private void print() {
		System.out.println("---");
		System.out.println(last);
		System.out.println(value);
		System.out.println(next);
		if (!endOfList()) {
			next.print();
		}
	}

	private void linkInt(LinkedInt newInt) {
		if (endOfList()) {
			link(this, newInt);
		} else {
			next.linkInt(newInt);
		}
	}

	private void setLast(LinkedInt newLast) {
		last = newLast;
	}

	private void setNext(LinkedInt newNext) {
		next = newNext;
	}

	private LinkedInt getNext() {
		return next;
	}
	
	private int getValue() {
		return value;
	}

	private boolean startOfList() {
		return last == null;
	}

	private boolean endOfList() {
		return next == null;
	}

	private void swapNext() {
		link(last, next);		
		LinkedInt nextNext = next.getNext();
		link(next, this);
		link(this, nextNext);
		swapped = true;
	}

	private void link(LinkedInt a, LinkedInt b) {
		if (a != null) {
			a.setNext(b);
		}
		if (b != null) {
			b.setLast(a);
		}
	}

}