public class ListUtilitiesSpec {
	
	public static void main(String[] args) {
		ListUtilities utilities = new ListUtilities();
		int[] array = {11,5,9,4,2,3,7,6};
		LinkedList list = utilities.arrayToList(array);
		list.print();
		utilities.bubbleSort(list);
		list.print();
	}
	
}