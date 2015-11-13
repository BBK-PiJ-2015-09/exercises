public class Main {

	public static void main(String[] args) {
		ArrayCopier arrayCopier = new ArrayCopier();
		int[] src = { 1, 2, 3, 4};
		int[] destination;
		destination = new int[10];
		arrayCopier.copy(src, destination);
	}

}