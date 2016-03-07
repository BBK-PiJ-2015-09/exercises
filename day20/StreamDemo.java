import java.util.*;
import java.util.stream.*;
import java.util.StringJoiner;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("hi", "hello", "dog", "cat", "shoe", "house", "tree", "briar", "eve", "quo");

		System.out.println("\nQuestion 1:");
		words.stream().forEach(e -> System.out.println("  " + e));

		System.out.println("\nQuestion 2:");
		words.stream().forEach(System.out::println);

		System.out.println("\nQuestion 3:");
		// StringUtils.transformedList(words, s -> s + "!");
		words.stream().map(e -> e + "!").forEach(System.out::println);
		// StringUtils.transformedList(words, s -> s.replace("i", "eye"));
		words.stream().map(e -> e.replace("i", "eye")).forEach(System.out::println);
		// StringUtils.transformedList(words, String::toUpperCase);
		words.stream().map(String::toUpperCase).forEach(System.out::println);

		System.out.println("\nQuestion 4:");
		// StringUtils.allMatches(words, s -> s.length() < 4);
		words.stream().filter(e -> e.length() < 4).forEach(System.out::println);
		// StringUtils.allMatches(words, s -> s.contains("b"));
		words.stream().filter(e -> e.contains("b")).forEach(System.out::println);
		// StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
		words.stream().filter(e -> (e.length() % 2) == 0).forEach(System.out::println);

		System.out.println("\nQuestion 5:");
		words.stream()
			.map(String::toUpperCase)
			.filter(e -> e.length() < 4)
			.filter(e -> e.contains("E"))
			.forEach(System.out::println);
		words.stream()
			.map(String::toUpperCase)
			.filter(e -> e.length() < 4)
			.filter(e -> e.contains("Q"))
			.forEach(System.out::println);

		System.out.println("\nQuestion 6:");
		words.stream()
			.map(e -> toUpper(e))
			.filter(e -> e.length() < 4)
			.filter(e -> e.contains("E"))
			.forEach(System.out::println);

		System.out.println("\nQuestion 7:");
		String wordsUpcase = words.stream()
			.reduce("", (o, e) -> o + e.toUpperCase());
		System.out.println(wordsUpcase);

		System.out.println("\nQuestion 8:");
		String wordsUpcase2 = words.stream()
			.map(String::toUpperCase)
			.reduce("", (o, e) -> o + e);
		System.out.println(wordsUpcase2);

		System.out.println("\nQuestion 9:");
		String withCommas = words.stream()
			.collect(Collectors.joining(", "));
		System.out.println(withCommas);

		System.out.println("\nQuestion 10:");
		System.out.println(randomNumberList(10));


	}

	public static String toUpper(String in) {
		System.out.println(in);
		return in.toUpperCase();
	}

	public static List<Double> randomNumberList(int size) {
		List<Double> list = new ArrayList<>();
		Random random = new Random();
		random.doubles()
			.limit(size)
			.forEach(list::add);
		return list;
	}
}
