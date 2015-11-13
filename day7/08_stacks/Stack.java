public class Stack {
	private StackedInt bottom;

	public void push(int value) {
		System.out.println("Pushing " + value + "...");
		StackedInt newInt = new StackedInt(value);
		if (bottom == null) {
			bottom = newInt;
		} else {
			bottom.push(newInt);
		}
	}

	public void pop() {
		if (bottom == null) {
			System.out.println("Stack is empty");
		} else if (bottom.getNext() == null ) {
			System.out.println("Popping... it's a " + bottom.getValue());
			bottom = null;
		} else {
			bottom.pop();
		}
	}

	private int size() {
		int counter = 0;
		if ( bottom == null ) {
			return counter;
		} else {
			return bottom.size(counter);
		}
	}

	public void printSize() {
		System.out.println("There are " + size() + " requests in the stack.");
	}
}