public class ArrayCopier {

	public void copy(int[] src, int[] destination) {
		printArrays(src, destination);
		System.out.println("Copying...");
		if ( src.length >= destination.length ) {
			overflowCopy(src, destination);
		} else {
			underflowCopy(src, destination);
		}
		printArrays(src, destination);
	}

	private void overflowCopy(int[] src, int[] destination) {
		for(int i = 0; i < destination.length; i++) {
			destination[i] = src[i];
		}
	}

	private void underflowCopy(int[] src, int[] destination) {
		for(int i = 0; i < src.length; i++) {
			destination[i] = src[i];
		}
		for(int i = src.length; i < destination.length; i++) {
			destination[i] = 0;
		}
	}

	private void printArrays(int[] firstArray, int[] secondArray) {
		System.out.println("\n");
		System.out.println("FIRST ARRAY");
		for(int i = 0; i < firstArray.length; i++) {
			System.out.println(firstArray[i]);
		}
		System.out.println("\n");
		System.out.println("SECOND ARRAY");
		for(int i = 0; i < secondArray.length; i++) {
			System.out.println(secondArray[i]);
		}
		System.out.println("\n");
	}
}