public class ListUtilitiesSpec {
	
	public static void main(String[] args) {
		ListUtilities utilities = new ListUtilities();
		int[] array = {5,4,3,2,1,10,93,2,10,3,99,1,4,7,2};
		LinkedList list = utilities.arrayToList(array);
		list.print();
	}
	
}