public class LinkedInt {
	private int value;
	private LinkedInt next;
	private LinkedInt last;
	private static boolean swapped;
	
	public LinkedInt(int value) {
		this.value = value;
		this.next = null;
		this.last = null;
		this.swapped = false;
	}

	public void bubbleSort(LinkedList list) {
		if (endOfList()) {
			if (swapped) {
				swapped = false;
				list.getStart().bubbleSort(list);
			}
		}  else if (value > next.getValue()) {
			if (startOfList()) {
				list.setStart(next);
			}
			swapNext();
			this.bubbleSort(list);
		} else {
			next.bubbleSort(list);
		}
	}

	public void print() {
		System.out.println(value);
		if (!endOfList()) {
			next.print();
		}
	}

	public void addInt(LinkedInt newInt) {
		if (endOfList()) {
			link(this, newInt);
		} else {
			next.addInt(newInt);
		}
	}

	private int getValue() {
		return value;
	}

	private LinkedInt getNext() {
		return next;
	}

	private void setNext(LinkedInt newNext) {
		next = newNext;
	}

	private void setLast(LinkedInt newLast) {
		last = newLast;
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