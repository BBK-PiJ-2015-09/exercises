class HailstoneTest {

	public static void main(String args[]) {
		Hailstone hailstone = new Hailstone();
		int input = 123485;
		long start = System.currentTimeMillis();
		int[] results = hailstone.get(input);
		long finish = System.currentTimeMillis();
		for(int i = 0; i < results.length; i++) {``
			System.out.println(results[i]);
		}
		System.out.println("With memoization, " + input + " to 1 took: " + (finish - start) + "ms");
	}

}