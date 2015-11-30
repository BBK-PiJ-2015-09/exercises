public class EvenString extends String {
	
	/**
	 * This does not work because string cannot be extended; it's a final class.
	 */
	public void printEven() {
		int length = this.length();
		for(int i = 0; i < length; i++) {
			if (i % 2 == 0) {
				System.out.println(this.charAt(i));
			}
		}
	}
	
}