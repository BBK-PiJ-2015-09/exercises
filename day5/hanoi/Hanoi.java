public class Hanoi {

	private Tower towerOne;
	private Tower towerTwo;
	private Tower towerThree;

	public Hanoi(int size) {
		towerOne = new Tower(size);
		towerTwo = new Tower(size);
		towerThree = new Tower(size);
		towerOne.addRings(64);
	}

	public int run() {
		return 0;
	}

}
