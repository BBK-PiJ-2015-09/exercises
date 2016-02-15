public class Counter {
	private int n = 0;
	public void increase() {
		System.out.println("Increase from " + n + " to " + (n+1));
		n++;
	}

	public int getCount() {
		return n;
	}
}