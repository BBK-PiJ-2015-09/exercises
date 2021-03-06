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

		System.out.println("\nQuestion 11:");
		System.out.println(orderedNumberList(50, 5, 20));

		System.out.println("\nQuestion 12:");
		System.out.println(sum(orderedNumberList(50, 5, 400)));

		System.out.println("\nQuestion 13:");
		System.out.println(
			sumParallel(orderedNumberList(50, 5, 400)) == sum(orderedNumberList(50, 5, 400))
		);

		System.out.println("\nQuestion 14:");
		List<Double> list = orderedDoubleList(-10, 6, 30);
		System.out.println(product(list));
		System.out.println(productParallel(list));
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

	public static List<Integer> orderedNumberList(int start, int step, int max) {
		List<Integer> list = new ArrayList<>();
		IntStream.iterate(start, i -> i + step)
			.limit(max)
			.forEach(list::add);
		return list;
	}

	public static List<Double> orderedDoubleList(int start, int step, int max) {
		List<Double> list = new ArrayList<>();
		DoubleStream.iterate(start, i -> i + step)
			.limit(max)
			.forEach(list::add);
		return list;
	}

	public static int sum(List<Integer> ints) {
		return ints.stream().reduce(Integer::sum).get();
	}

	public static int sumParallel(List<Integer> ints) {
		return ints.stream().parallel().reduce(Integer::sum).get();
	}

	public static double product(List<Double> doubles) {
		return doubles.stream().reduce(1.0, (a, b) -> a * b);
	}

	public static double productParallel(List<Double> doubles) {
		return doubles.stream().parallel().reduce(1.0, (a, b) -> a * b);
	}

}
