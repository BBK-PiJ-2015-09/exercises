public class RecursiveCode {

	public static void printNumbers(int n) {
		if (n <= 0) {
			return;
		}
		System.out.println(n);
		printNumbers(n-2);
		printNumbers(n-3);
		System.out.println(n);
	}

	public static String buggyMethod(int n) {
		if (n <= 0) {
			return "";
		}
		return n + " " + buggyMethod(n-2);
	}

}