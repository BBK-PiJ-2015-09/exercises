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

	// public LinkedInt getEnd() {
	// 	if (next == null) {
	// 		return this;
	// 	} else {
	// 		return next.getEnd();
	// 	}
	// }

	public void pry(boolean swapped, LinkedList list, String location, int pass) {
		System.out.println("On pass: " + pass);
		System.out.println("At location: " + location);
		System.out.println("Swapped is " + swapped);
		System.out.println("The current int is: ");
		printInt();
		System.out.println("The state of the list is:");
		list.print();
		System.out.println("------------");
	}

	public void bubbleSort(LinkedList list) {
		if (endOfList()) {
			if (swapped) {
				swapped = false;
				list.getStart().bubbleSort(list);
			}
		} else if (value > next.getValue()) {
			if (startOfList()) {
				list.setStart(next);
			}
			swapNext();
			this.bubbleSort(list);
		} else {
			next.bubbleSort(list);
		}
	}

	public void cocktailSort(LinkedList list, int pass) {
		pry(swapped, list, "cocktailSort", pass);
		forwardBubbleSort(list, pass);
	}

	public void forwardBubbleSort(LinkedList list, int pass) {
		// pry(swapped, list, "forwardBubbleSort", pass);
		if (endOfList()) {
			pass++;
			if (swapped) {
				swapped = false;
				backwardBubbleSort(list, pass);
			}
		} else if (value > next.getValue()) {
			if (startOfList()) {
				list.setStart(next);
			}
			swapNext();
			this.forwardBubbleSort(list, pass);
		} else {
			next.forwardBubbleSort(list, pass);
		}
	}

	public void backwardBubbleSort(LinkedList list, int pass) {
		// pry(swapped, list, "backwardBubbleSort", pass);
		if (startOfList()) {
			if (swapped) {
				swapped = false;
				forwardBubbleSort(list, pass);
			}
		} else if (value < last.getValue()) {
			if (last.startOfList()) {
				list.setStart(this);
			}
			swapLast();
			this.backwardBubbleSort(list, pass);
		} else {
			last.backwardBubbleSort(list, pass);
		}
	}

	private void swapNext() {
		link(last, next);		
		LinkedInt nextNext = next.getNext();
		link(next, this);
		link(this, nextNext);
		swapped = true;
	}

	private void swapLast() {
		link(last, next);		
		LinkedInt lastLast = last.getLast();
		link(this, last);
		link(lastLast, this);
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

	public void printInt() {
		System.out.println("---");
		if (startOfList()) {
			System.out.println("Last: null");
		} else {
			System.out.println("Last: " + last.getValue());
		}
		System.out.println("Value: " + value);
		if (endOfList()) {
			System.out.println("Next: null");
		} else {
			System.out.println("Next: " + next.getValue());
		}
		System.out.println("---");
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