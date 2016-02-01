import java.util.*;

public class Patient {
	private String name;
	private int yob;

	public Patient(String name, int yob) throws IllegalArgumentException {
		this.name = name;

		int thisYear = Calendar.getInstance().get(Calendar.YEAR);

		if(yob > thisYear || yob < thisYear - 130) {
			throw new IllegalArgumentException();
		} else {
			this.yob = yob;
		}
	}

}