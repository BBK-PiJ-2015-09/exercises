public class ComparatorTest {

	public static void main(String[] args) {
		// safe
		// Comparator<Integer> intComparator = new Comparator<>();
		// System.out.println(intComparator.getMax(5,6));
		// Comparator<Double> doubleComparator = new Comparator<>();
		// System.out.println(doubleComparator.getMax(5.1,6.2));
		// Comparator<String> stringComparator = new Comparator<>();
		// System.out.println(stringComparator.getMax("5","6"));
		
		// or even unsafe... (throws error but compiles & runs)
		Comparator comparator = new Comparator();
		System.out.println(comparator.getMax(5,6));
		System.out.println(comparator.getMax(5.1,6.2));
		System.out.println(comparator.getMax("5","6"));
		
	}

}
