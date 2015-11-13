public class HospitalManager {
	private static Patient patientListStart = null;
	private static int listLength = 0;

	public void launch() {
		Patient newPatient = new Patient("Johnny Firstpatient", 33, "Tuberculosis");
		patientListStart = newPatient;
	}
	
	public void incrementListLength() {
		listLength++;
	}
	
	public void resetListLength() {
		listLength = 0;
	}
	
	public void setPatientListStart(Patient patient) {
		patientListStart = patient;
	}
	
	public Patient getPatientListStart() {
		return patientListStart;
	}

	private void addPatient(Patient newPatient, Patient firstPatient) {
		patientListStart.appendPatient(newPatient, firstPatient);
	}

	private void printList() {
		patientListStart.printList(patientListStart);
	}

	private void printListBackwards() {
		patientListStart.getLastPatient().printListBackwards(patientListStart.getLastPatient());
	}

	private void deletePatient(Patient patient) {
		patientListStart.deletePatient(patient, patientListStart);
	}

	public static void main(String[] args) {
		
		HospitalManager hm = new HospitalManager();
		hm.launch();
		
		Patient michael = new Patient("Michael", 33, "Leg pain");
		hm.addPatient(michael, hm.getPatientListStart());
		Patient dave = new Patient("Dave", 31, "Back pain");
		hm.addPatient(dave, hm.getPatientListStart());
		Patient john = new Patient("John", 30, "Sore throat");
		hm.addPatient(john, hm.getPatientListStart());
		Patient simon = new Patient("Simon", 28, "Bad Head");
		hm.addPatient(simon, hm.getPatientListStart());
		Patient mark = new Patient("Mark", 31, "Sore foot");
		hm.addPatient(mark, hm.getPatientListStart());
		Patient lee = new Patient("Lee", 36, "Bad Neck");
		hm.addPatient(lee, hm.getPatientListStart());

		System.out.println("--------------------");
		hm.printList();
		System.out.println("--------------------");
		hm.printListBackwards();
		System.out.println("--------------------");

		hm.deletePatient(lee);

		System.out.println("--------------------");
		hm.printList();
		System.out.println("--------------------");
		hm.printListBackwards();
		System.out.println("--------------------");

		Patient roger = new Patient("Roger", 76, "Bad hat");
		hm.addPatient(roger, hm.getPatientListStart());

		hm.deletePatient(lee);

		System.out.println("--------------------");
		hm.printList();
		System.out.println("--------------------");
		hm.printListBackwards();
		System.out.println("--------------------");
		
	}

}