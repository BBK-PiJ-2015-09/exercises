class Hailstone {
	
	public static void main(String args[]) {
		int i = 1000000000;
		long start = System.currentTimeMillis();
		naiveHailstones(i);
		long finish = System.currentTimeMillis();
		System.out.println("Without memoization, " + i + " places took: " + (finish - start) + "ms");
	}
	
	public static int naiveHailstones(int n) {
		System.out.println(n);
		if (n == 1) {
			return n;
		} else if (n % 2 == 0) {
			return naiveHailstones(n / 2);
		} else {
			return naiveHailstones((3 * n) + 1);
		}
	}
	
}