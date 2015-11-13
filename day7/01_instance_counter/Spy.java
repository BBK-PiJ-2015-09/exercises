public class Spy {
	
	private static int spyCount;
	private int spyId;

	public Spy(int id) {
		spyId = id;
		incrementSpyCount();
		printSpyId();
		printNumberOfSpies();
	}

	private void incrementSpyCount() {
		spyCount++;
	}
	
	public void die() {
		System.out.println("Spy " + spyId + " has been detected and eliminated");
		spyCount--;
		printNumberOfSpies();
		
	}
	
	public void printNumberOfSpies() {
		System.out.println(spyCount);
	}
	
	public void printSpyId() {
		System.out.println(spyId);
	}
}