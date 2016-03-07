import java.util.*;
import java.util.stream.*;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("hi", "hello", "dog", "cat", "shoe", "house", "tree");
		Stream<String> wordsStream = words.stream();
		wordsStream.forEach((n) -> System.out.println("  " + n));
	}

}
