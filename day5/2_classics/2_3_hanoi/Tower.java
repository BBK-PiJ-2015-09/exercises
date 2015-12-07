public class Tower {
	private int[] rings;
	private int topIndex = 0;

	public Tower(int size) {
		rings = new int[size];
	}

	public void addRings(int count) {
		int diameter = count;
		for(int i = 0; i < count; i++) {
			addRing(diameter);
			diameter--;
		}
	}

	private void addRing(int diameter) {
		rings[topIndex] = diameter;
		topIndex++;
	}

	public int topRingSize() {
		System.out.println("topIndex is " + topIndex);
		return rings[topIndex-1];
	}

	public int getTopIndex() {
		return topIndex;
	}

	public boolean empty() {
		return topIndex == 0;
	}

}
