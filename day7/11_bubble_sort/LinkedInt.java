public class LinkedInt {
	private int value;
	private LinkedInt next;
	private LinkedInt last;
	
	public LinkedInt(int value) {
		this.value = value;
		this.next = null;
		this.last = null;
	}

	public void intAddInt(LinkedInt newInt) {
		if (next == null) {
			next = newInt;
			newInt.setLast(this);
		} else {
			next.intAddInt(newInt);
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
	
	public void pry(boolean swapped, LinkedList list, String location, int pass) {
		System.out.println("On pass: " + pass);
		System.out.println("At location: " + location);
		System.out.println("Swapped is " + swapped);
		System.out.print("The current int is: ");
		print();
		System.out.println("The state of the list is:");
		list.print();
		System.out.println("------------");
	}
	
	public void intBubbleSort(int pass, boolean swapped, LinkedList list) {
		pry(swapped, list, "A", pass);
		if (next == null) {
			pass++;
			pry(swapped, list, "B", pass);
			if (swapped) {
				swapped = false;
				list.getStart().intBubbleSort(pass, swapped, list);
			} else {
				// finish
			}
		} else if ( this == list.getStart() && value > next.getValue()) {
			pry(swapped, list, "C", pass);
			startSwap(list);
			swapped = true;
			this.intBubbleSort(pass, swapped, list);
		}  else if (value > next.getValue()) {
			pry(swapped, list, "D", pass);
			swap();
			swapped = true;
			this.intBubbleSort(pass, swapped, list);
		} else {
			pry(swapped, list, "E", pass);
			next.intBubbleSort(pass, swapped, list);
		}
	}
	
	public void startSwap(LinkedList list) {
		if (next.getNext() != null) {
			LinkedInt tempNextNext = next.getNext();
			list.setStart(next);
			next.setLast(null);
			next.setNext(this);
			last = next;
			next = tempNextNext;
			next.setLast(this);
		} else {
			list.setStart(next);
			next.setLast(null);
			next.setNext(this);
			next = null;
		}
	}

	public void swap() {
		if ( next.getNext() != null ) {
			LinkedInt tempNextNext = next.getNext();
			last.setNext(next);
			next.setLast(last);
			last = next;
			next.setNext(this);
			next = tempNextNext;
			next.setLast(this);
		} else {
			last.setNext(next);
			next.setLast(last);
			last = next;
			next.setNext(this);
			next = null;
		}
	}

	public void print() {
		System.out.println(value);
	}

	public void printList(LinkedInt linkedInt) {
		if (linkedInt.next == null) {
			linkedInt.print();
		} else {
			linkedInt.print();
			printList(linkedInt.next);
		}
	}
}