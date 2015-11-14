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

	public void addInt(LinkedInt newInt) {
		if (endOfList()) {
			link(this, newInt);
		} else {
			next.addInt(newInt);
		}
	}

	public void setLast(LinkedInt newLast) {
		last = newLast;
	}

	public void setNext(LinkedInt newNext) {
		next = newNext;
	}

	public LinkedInt getNext() {
		return next;
	}
	
	public int getValue() {
		return value;
	}

	public boolean startOfList() {
		return last == null;
	}

	public boolean endOfList() {
		return next == null;
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

	public void swapNext() {
		link(last, next);		
		LinkedInt nextNext = next.getNext();
		link(next, this);
		link(this, nextNext);
		swapped = true;
	}

	public void link(LinkedInt a, LinkedInt b) {
		if (a != null) {
			a.setNext(b);
		}
		if (b != null) {
			b.setLast(a);
		}
	}

	public void printList(LinkedInt linkedInt) {
		System.out.println(linkedInt.getValue());
		if (!linkedInt.endOfList()) {
			printList(linkedInt.next);
		}
	}
}