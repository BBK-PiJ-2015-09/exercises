import java.util.*;

public class Patients {
	public static List<Patient> patients = new ArrayList<Patient>();

	public static void main(String[] args) {
		String input;
		String name;
		int yobInt;
		do {
			System.out.print("Name: ");
			input = System.console().readLine();
			name = input;
			System.out.print("Year of birth: ");
			input = System.console().readLine();
			yobInt = Integer.parseInt(input);
			Patient patient = new Patient(name, yobInt);
			patients.add(patient);
			input = System.console().readLine("Exit y/n: ");
		} while(!input.equals("y"));
	}

}
