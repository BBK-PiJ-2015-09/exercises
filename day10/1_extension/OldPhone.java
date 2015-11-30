/**
 * An old phone like a rotary phone. Makes calls.
 */
public class OldPhone implements Phone {
	private String brand = null;

	public OldPhone(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	// ... there is no setter for brand
	/**
	 * Just print on the screen: "Calling <number>...".
	 * @param number The number to be called.
	 */
	public void call(String number) {
		System.out.println("Calling " + number + "...");
	}

	

}