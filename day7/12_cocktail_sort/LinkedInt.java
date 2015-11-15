public class LinkedInt {
	private int value;
	private LinkedInt next;
	private LinkedInt last;
	
	public LinkedInt(int value) {
		this.value = value;
		this.next = null;
		this.last = null;
	}

	public void addInt(LinkedInt newInt) {
		if (endOfList()) {
			link(this, newInt);
		} else {
			next.addInt(newInt);
		}
	}

	public void print() {
		System.out.println(value);
		if (!endOfList()) {
			next.print();
		}
	}

	public void bubbleSort(LinkedList list, boolean swapped) {
		if (endOfList()) {
			if (swapped) {
				swapped = false;
				list.getStart().bubbleSort(list, swapped);
			}
		} else if (value > next.getValue()) {
			if (startOfList()) {
				list.setStart(next);
			}
			swapped = this.swapNext();
			this.bubbleSort(list, swapped);
		} else {
			next.bubbleSort(list, swapped);
		}
	}

	public void cocktailSort(LinkedList list, boolean forward, boolean swapped) {
		if (forward) {
			forwardBubble(list, forward, swapped);
		} else {
			backwardBubble(list, forward, swapped);
		}
	}

	private void forwardBubble(LinkedList list, boolean forward, boolean swapped) {
		if (endOfList()) {
			nextLoopChecker(list, forward, swapped);
		} else if (this.getValue() > next.getValue()) {
			if (this.startOfList()) {
				list.setStart(next);
			}
			swapped = this.swapNext();
			cocktailSort(list, forward, swapped);
		} else {
			next.cocktailSort(list, forward, swapped);
		}
	}

	private void backwardBubble(LinkedList list, boolean forward, boolean swapped) {
		if (startOfList()) {
			nextLoopChecker(list, forward, swapped);
		} else if (last.getValue() > this.getValue()) {
			if (last.startOfList()) {
				list.setStart(this);
			}
			swapped = last.swapNext();
			cocktailSort(list, forward, swapped);
		} else {
			last.cocktailSort(list, forward, swapped);
		}
	}

	private void nextLoopChecker(LinkedList list, boolean forward, boolean swapped) {
		if (swapped) {
			swapped = false;
			cocktailSort(list, !forward, swapped);
		}
	}

	private boolean swapNext() {
		link(last, next);		
		LinkedInt nextNext = next.getNext();
		link(next, this);
		link(this, nextNext);
		return true;
	}

	private void link(LinkedInt a, LinkedInt b) {
		if (a != null) {
			a.setNext(b);
		}
		if (b != null) {
			b.setLast(a);
		}
	}

	private int getValue() {
		return value;
	}

	private LinkedInt getNext() {
		return next;
	}

	private LinkedInt getLast() {
		return last;
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

}