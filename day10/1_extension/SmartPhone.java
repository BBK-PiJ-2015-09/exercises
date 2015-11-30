/**
 * A smart phone like an iPhone.
 */
public class SmartPhone extends MobilePhone {
	
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

}