/**
 * An old phone like a rotary phone. Makes calls.
 */
public class OldPhone implements Phone {

	/**
	 * Just print on the screen: "Calling <number>...".
	 * @param number The number to be called.
	 */
	public void call(String number) {
		System.out.println("Calling " + number + "...");
	}

}