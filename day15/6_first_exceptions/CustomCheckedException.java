public class CustomCheckedException extends Exception {

	public CustomCheckedException() {
		System.out.println("CustomCheckedException");
	}

	public CustomCheckedException(String ex) {
		System.out.println(ex);
	}

	public CustomCheckedException(Exception ex) {

	}

}