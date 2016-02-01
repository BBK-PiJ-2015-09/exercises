import java.util.*;

public class MeanChoice {

	public static void main(String[] args) {
		System.out.print("How many numbers do you want to enter?: ");
		String count = System.console().readLine();
		int countInt = toInt(count);
		launch(countInt);
	}

	public static void launch(int countInt) {
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < countInt; i++) {
			System.out.print("Please enter number " + (i+1) + ": ");
			String input = System.console().readLine();
			int inputInt = toInt(input);
			intList.add(inputInt);
		}
		System.out.println(intList);
	}

	public static int toInt(String input) {
		try {
			return Integer.parseInt(input);
		} catch (NumberFormatException ex) {
			System.out.print("That's not a number, try again: ");
			input = System.console().readLine();
			return toInt(input);
		}
	}

}
