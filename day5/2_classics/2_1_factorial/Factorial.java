public class Factorial {

	int recursiveFactorial(int n) {
		if (n == 1) {
			return n;
		} else {
			return n * recursiveFactorial(n-1);
		}
	}
	
	int iterativeFactorial(int n) {
		int output = 1;
		while (n > 0) {
			output *= n;
			n -= 1;
		}
		return output;
	}

}