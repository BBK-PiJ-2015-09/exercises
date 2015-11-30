public class LastNumber {
	private String number;
	private LastNumber next;

	public LastNumber(String number) {
		this.number = number;
	}

	public void add(String number) {
		if (next == null) {
			next = new LastNumber(number);
		} else {
			next.add(number);
		}
	}

	public String allNumbers(int counter) {
		counter++;
		if (next != null && counter < 10) {
			return next.allNumbers(counter) + "/" + number;
		} else {
			return number;
		}
	}

}