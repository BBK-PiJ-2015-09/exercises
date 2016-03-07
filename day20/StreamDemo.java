import java.util.*;
import java.util.stream.*;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("hi", "hello", "dog", "cat", "shoe", "house", "tree");
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
	}

}
