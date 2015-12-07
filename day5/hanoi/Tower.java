public class Tower {

	private int[] rings;

	public Tower(int size) {
		rings = new int[size];
	}

	public void addRings(int count) {
		int diameter = count;
		for(int i = 0; i < count; i++) {
			rings[i] = diameter;
			diameter--;
		} 
	}

	private void addRing(int diameter) {
		

	}
}
