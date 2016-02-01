import java.util.*;

public class RedundantCatch {

	public static void main(String[] args) {
		launch(0);
		launch(2);
		launch(4);
		launch(6);
	}

	public static void launch(int userInput) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		try {
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
		} catch (Exception ex) {
			System.out.println("Catchall");
	 		ex.printStackTrace();
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("IndexOutOfBounds catcher");
			ex.printStackTrace();
		}
	}
}
