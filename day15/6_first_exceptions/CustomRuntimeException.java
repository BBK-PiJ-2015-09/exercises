public class CustomRuntimeException extends RuntimeException {

	public CustomRuntimeException() {
		System.out.println("CustomRuntimeException");
	}

	public CustomRuntimeException(String ex) {
		System.out.println(ex);
	}

	public CustomRuntimeException(Exception ex) {

	}

}