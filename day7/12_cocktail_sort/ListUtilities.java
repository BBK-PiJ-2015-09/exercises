public class ListUtilities {
	
	public LinkedList arrayToList(int[] array) {
		LinkedList list = new LinkedList();
		for(int i = 0; i < array.length; i++) {
			list.addInt(array[i]);
		}
		return list;
	}
	
	public void bubbleSort(LinkedList list) {
		list.bubbleSort();
	}
	
	public void cocktailSort(LinkedList list) {
		list.cocktailSort();
	}
	
	public void benchmark(LinkedList list, String algorithm) {
		if (algorithm == "bubble") {
			long start = System.nanoTime();
			list.bubbleSort();
			long result = System.nanoTime() - start;
			System.out.println(algorithm + " sorted in " + result + "ns!");
		} else if (algorithm == "cocktail") {
			long start = System.nanoTime();
			list.cocktailSort();
			long result = System.nanoTime() - start;
			System.out.println(algorithm + " sorted in " + result + "ns!");
		}
	}
	
}