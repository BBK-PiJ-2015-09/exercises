public class ListUtilitiesSpec {

	public static void main(String[] args) {
		ListUtilities utilities = new ListUtilities();
		int[] array = {11,5,9,4,2,3,7,6,-1,-2};
		LinkedList list = utilities.arrayToList(array);
		utilities.bubbleSort(list);
		list.print();
	}

}