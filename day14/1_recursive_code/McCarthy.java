class McCarthy {

	public static void main(String args[]) {
		System.out.println(mcCarthy91(50));
		System.out.println(mcCarthy91(73));
		System.out.println(mcCarthy91(95));
	}

	public static int mcCarthy91(int n) {
		System.out.println("n is " + n);
		if (n > 100) {
			return n - 10;
		} else {
			return mcCarthy91(mcCarthy91(n + 11));
		}
	}
	
}