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
		if (next == null) {
			next = newInt;
			newInt.setLast(this);
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
	
	public void bubbleSort(int pass, boolean swapped, LinkedList list) {
		pry(swapped, list, "A", pass);
		if (next == null) {
			pass++;
			pry(swapped, list, "B", pass);
			if (swapped) {
				swapped = false;
				list.getStart().bubbleSort(pass, swapped, list);
			}
		}  else if (value > next.getValue()) {
			pry(swapped, list, "D", pass);
			swap(list);
			swapped = true;
			this.bubbleSort(pass, swapped, list);
		} else {
			pry(swapped, list, "E", pass);
			next.bubbleSort(pass, swapped, list);
		}
	}

	public void swap(LinkedList list) {
		LinkedInt tempNextNext = next.getNext();
		if (last == null) {
			list.setStart(next);
		} else {
			last.setNext(next);
		}
		next.setLast(last);
		last = next;
		next.setNext(this);
		next = tempNextNext;
		if (next!=null) {
			next.setLast(this);
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