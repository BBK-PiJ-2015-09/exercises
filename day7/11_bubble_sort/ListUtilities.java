public class ListUtilities {
	
	public LinkedList arrayToList(int[] array) {
		LinkedList list = new LinkedList();
		for(int i = 0; i < array.length; i++) {
			list.addInt(array[i]);
		}
		return list;
	}
	
	public static LinkedList bubbleSort(LinkedList list) {
		return list.bubbleSort();
	}
	
}