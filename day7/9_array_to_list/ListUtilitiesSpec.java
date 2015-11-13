public class ListUtilitiesSpec {
	
	public static void main(String[] args) {
		ListUtilities utilities = new ListUtilities();
		int[] array = {1,2,3,4,5};
		LinkedList list = utilities.arrayToList(array);
		list.print();
	}
	
}