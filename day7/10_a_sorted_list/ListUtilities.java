public class ListUtilities {
	
	public LinkedList arrayToList(int[] array) {
		LinkedList linkedList = new LinkedList();
		for(int i = 0; i < array.length; i++) {
			linkedList.addInt(array[i]);
		}
		return linkedList;
	}
	
}