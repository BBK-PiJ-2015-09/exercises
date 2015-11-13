public class QueuedInt {
	private int value;
	private QueuedInt next;
	
	public QueuedInt(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public QueuedInt getNext() {
		return next;
	}
	
	public void insert(QueuedInt newInt) {
		if (next == null) {
			next = newInt;
		} else {
			next.insert(newInt);
		}
	}
	
	public int size(int counter) {
		if ( next == null ) {
			counter++;
			return counter;
		} else {
			counter++;
			return next.size(counter);
		}
	}
}