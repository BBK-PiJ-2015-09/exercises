public class Hanoi {
	private Tower towerOne;
	private Tower towerTwo;
	private Tower towerThree;

	public Hanoi(int size) {
		towerOne = new Tower(size);
		towerTwo = new Tower(size);
		towerThree = new Tower(size);
		towerOne.addRings(size);
	}

	public Tower getTowerOne() {
		return towerOne;
	}

	public Tower getTowerTwo() {
		return towerTwo;
	}

	public Tower getTowerThree() {
		return towerThree;
	}

	public String topRingSizes() {
		return towerOne.topRingSize() + " " + towerTwo.topRingSize() + " " + towerThree.topRingSize();
	}

	public String topIndexes() {
		return towerOne.getTopIndex() + " " + towerTwo.getTopIndex() + " " + towerThree.getTopIndex();
	}

	public int run() {
		return 0;
	}

}
