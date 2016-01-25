class LineByLine {

	public static void main(String args[]) {
		// System.out.println(doggyMethod(10));
		for(int i = 0; i < 30; i++) {
			System.out.println(fixedDoggyMethod(i));
		}
	}

	public static String doggyMethod(int n) {
		// will recurse infinitely, causing a StackOverflowError
		String result = doggyMethod(n-3) + n + doggyMethod(n-2);
		if (n <= 0) {
			return "";
		}
		return result;
	}
	
	public static String fixedDoggyMethod(int n) {
		if (n <= 0) {
			return "";
		}
		String result = fixedDoggyMethod(n-3) + n + fixedDoggyMethod(n-2);
		return result;
	}
	
}