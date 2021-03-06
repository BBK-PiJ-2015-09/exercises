/**
 * A smart phone like an iPhone.
 */
public class SmartPhone extends MobilePhone {

	/**
	 * Set brand in constructor.
	 * @param brand the brand of the phone
	 */
	public SmartPhone(String brand) {
		super(brand);
	}

	/**
	 * Prints: "Calling <number>...".
	 * Adds number to history and removes oldest number
	 * @param number the phone number to be called
	 * @Override
	 */
	public void call(String number) {
		super.call(number);
		if (number.charAt(0) == '0' && number.charAt(1) == '0') {
			System.out.println("through the internet to save money...");
		}
	}

	/**
	 * GETs web address.
	 * @param address the web address to GET.
	 */
	public void browseWeb(String address) {
		System.out.println("GET address");
	}

	/**
	 * Prints GPS coordinates on screen.
	 */
	public void findPosition() {
		System.out.println("GPS Coords: N 10° 20.345' E 10° 20.345'");
	}

	/**
	 * Prints game on screen.
   	 * @param game the game to be played. 
	 */
	public void playGame(String game) {
		System.out.println("Playing " + game + "!");
	}

}