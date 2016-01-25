class Memoization {
	public static int[] memo = new int[10];
	public static int memoLength = 10;
	public static int memoizedCount = 0;
	
	public static long[] longMemo = new long[10];
	public static int longMemoLength = 10;
	public static long longMemoizedCount = 0;

	public static void main(String args[]) {
		long start;
		long finish;
		int output;
		
		for(int i = 1; i < i+1; i++) {
			start = System.currentTimeMillis();
			output = fib(i);
			finish = System.currentTimeMillis();
			if (finish-start > 10000 || output < 0) {
				System.out.println("The highest possible fib number without memoization and taking less than 10 seconds is " + (i-1));
				break;
			}
			System.out.println("Without memoization, " + i + " places took: " + (finish - start) + "ms and gave the answer: " + output);
		}
		
		for(int i = 1; i < i+1; i++) {
			start = System.currentTimeMillis();
			output = fibMemoized(i);
			finish = System.currentTimeMillis();
			if (output < 0) {
				System.out.println("The highest possible fib number using ints is " + (i-1));
				break;
			}
			System.out.println("With memoization, " + i + " places took: " + (finish - start) + "ms and gave the answer: " + output);
		}

		long longOutput;

		for(int i = 1; i < i+1; i++) {
			start = System.currentTimeMillis();
			longOutput = longFibMemoized(i);
			finish = System.currentTimeMillis();
			if (longOutput < 0) {
				System.out.println("The highest fib number using longs is " + (i-1));
				break;
			}
			System.out.println("With memoization, " + i + " places took: " + (finish - start) + "ms and gave the answer: " + longOutput);
		}

	}

	public static int fib(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			int result = fib(n-1) + fib(n-2);
			return result;
		}
	}

	public static int fibMemoized(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		} else if (memoizedCount > n && memo[n] != 0) {
			return memo[n];
		} else {
			int result = fibMemoized(n-1) + fibMemoized(n-2);
			if (memoizedCount == memoLength-1) {
				memo = enlarge(memo, n);
			}
			memo[n] = result;
			memoizedCount++;
			return result;
		}
	}

	private static int[] enlarge(int[] oldArray, int n) {
		int[] newArray = new int[memoLength * 2];
		for(int i = 0; i < memoLength; i++) {
			newArray[i] = oldArray[i];
		}
		memoLength *= 2;
		return newArray;
	}

	public static long longFibMemoized(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		} else if (longMemoizedCount > n && longMemo[n] != 0) {
			return longMemo[n];
		} else {
			long result = longFibMemoized(n-1) + longFibMemoized(n-2);
			if (longMemoizedCount == longMemoLength-1) {
				longMemo = longEnlarge(longMemo);
			}
			longMemo[n] = result;
			longMemoizedCount++;
			return result;
		}
	}
	
	private static long[] longEnlarge(long[] oldArray) {
		long[] newArray = new long[longMemoLength * 2];
		for(int i = 0; i < longMemoLength; i++) {
			newArray[i] = oldArray[i];
		}
		longMemoLength *= 2;
		return newArray;
	}

}
