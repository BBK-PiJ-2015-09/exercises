public class RestrictedSmartPhone extends SmartPhone {

	/**
	 * Set brand in constructor.
	 * @param brand the brand of the phone
	 */
	public RestrictedSmartPhone(String brand) {
		super(brand);
	}

	/**
	 * Trick question! It is not possible to reduce visibility in extended class, only increase it.
	 * @param game the game to play
	 * @override playGame to prevent fun
	 */
	// private void playGame(String game) {
	// 	System.out.println("This game is restricted.");
	// }
}
