public class Hanoi {

	public int howManyMoves(int n) {
		if (n == 1) {
			return n;
		} else {
			return 2 * howManyMoves(n-1) + 1;
		}
	}

	public int moves(int n) {
		return (int)Math.pow(2, n) -1;
	}

}
