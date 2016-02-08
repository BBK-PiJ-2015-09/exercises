public class ExceptionTest {

	public static void main(String[] args) {

		throw new CustomRuntimeException();
		throw new CustomCheckedException();

		launch();
	}

	public static void launch() {
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			System.out.print("Please enter number " + (i+1) + ": ");
			String input = System.console().readLine();
			int inputInt = toInt(input);
			intList.add(inputInt);
		}
		System.out.println(intList);
	}


}