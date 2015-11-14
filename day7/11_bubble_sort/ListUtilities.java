public class ListUtilities {
	
	public LinkedInt arrayToList(int[] array) {
		LinkedInt firstInt = new LinkedInt(array[0]);
		for(int i = 0; i < array.length; i++) {
			firstInt.addInt(array[i]);
		}
		return firstInt.getStart();
	}
	
	public void bubbleSort(LinkedInt list) {
		list.bubbleSort();
	}
	
}