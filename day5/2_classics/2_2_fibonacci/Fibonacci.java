public class Fibonacci {
	
	public int recursiveFib(int n) {
		if (n < 3) {
			return 1;
		} else {
			return recursiveFib(n - 1) + recursiveFib(n - 2);
		}
	}

	public int iterativeFib(int n) {
		int nFib = 0;
		int lastFib = 0;
		int lastButOneFib = 0;
		int counter = 0;
		while (counter <= n) {
			if ( counter < 3 ) {
				nFib = 1;
				lastFib = 1;
				lastButOneFib = 1;
			} else {
				nFib = lastButOneFib + lastFib;
				lastButOneFib = lastFib;
				lastFib = nFib;
			}
			counter++;
		}
		return nFib;
	}

}
