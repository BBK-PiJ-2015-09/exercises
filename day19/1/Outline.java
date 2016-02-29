import java.util.Arrays;

public class Outline {
	public static void main(String[] args) {
		String[] stringArray = { "the", "quick", "brown", "fox", "jumped", "over", "ever", "heat", "bees", "box" };
		sortByLength(stringArray);
		sortByLengthReversed(stringArray);
		sortByFirstChar(stringArray);
		sortByContainsLetter(stringArray, 'e');
		System.out.println(Arrays.asList(stringArray));
	}

	public static void sortByLength(String[] stringArray) {
		Arrays.sort(stringArray, (String a, String b) -> a.length() - b.length());
	}

	public static void sortByLengthReversed(String[] stringArray) {
		Arrays.sort(stringArray, (String a, String b) -> b.length() - a.length());
	}

	public static void sortByFirstChar(String[] stringArray) {
		Arrays.sort(stringArray, (String a, String b) -> a.charAt(0) - b.charAt(0));
	}

	public static void sortByContainsLetter(String[] stringArray, char c) {
		Arrays.sort(stringArray, (String a, String b) -> b.indexOf(c) - a.indexOf(c));
	}

}
