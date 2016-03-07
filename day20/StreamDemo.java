import java.util.*;
import java.util.stream.*;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("hi", "hello", "dog", "cat", "shoe", "house", "tree");
		System.out.println("Question 1:");
		words.stream().forEach((n) -> System.out.println("  " + n));
		System.out.println("Question 2:");
		words.stream().forEach(System.out::println);
	}

}
