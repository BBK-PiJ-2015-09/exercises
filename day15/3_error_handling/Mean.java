import java.util.*;

public class Mean {

	public static void main(String[] args) {
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

	public static int toInt(String input) {
		// bad. shouldn't do loops with tries in them, should do a checking loop and then throw the exception if it's not an int.
		try {
			return Integer.parseInt(input);
		} catch (NumberFormatException ex) {
			System.out.print("That's not a number, try again: ");
			input = System.console().readLine();
			return toInt(input);
		}
	}

}
