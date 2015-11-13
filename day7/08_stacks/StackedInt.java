public class StackedInt {
	private int value;
	private StackedInt next;
	
	public StackedInt(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public StackedInt getNext() {
		return next;
	}
	
	public void push(StackedInt newInt) {
		if (next == null) {
			next = newInt;
		} else {
			next.push(newInt);
		}
	}

	public void pop() {
		if (next.getNext() == null) {
			System.out.println("Popping... it's a " + next.getValue());
			next = null;
		} else {
			next.pop();
		}
	}

	public int size(int counter) {
		counter++;
		if ( next == null ) {
			return counter;
		} else {
			return next.size(counter);
		}
	}
}