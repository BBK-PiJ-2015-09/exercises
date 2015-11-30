/**
 * A mobile phone like a Nokia brick.
 */
public class MobilePhone extends OldPhone {
	private String[] callHistory = new String[10];

	/**
	 * Prints: "Calling <number>...".
	 * Adds number to history and removes oldest number
	 * @param number the phone number to be called
	 * @Override
	 */
	public void call(String number) {
		System.out.println("Calling " + number + "...");
		shiftCallHistory();
		callHistory[0] = number;
	}

	private void shiftCallHistory() {
		for(int i = 9; i > 0; i--) {
			callHistory[i] = callHistory[i-1];
		}
	}

	/**
	 * Prints last 10 numbers.
	 */
	public void printLastNumbers() {
		for(int i = 0; i < 10; i++) {
			System.out.println(callHistory[i]);
		}
	}

	/**
	 * Prints alarm on screen.
	 * @param sound the sound to be played.
	 */
	public void ringAlarm(String sound) {
		System.out.println("Playing " + sound + " alarm!");
	}

	/**
	 * Prints game on screen.
   	 * @param game the game to be played.
	 */
	public void playGame(String game) {
		System.out.println("Playing " + game + "!");
	}

}