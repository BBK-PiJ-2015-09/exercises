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
	
	public static void main(String[] args) {
		
		HospitalManager hm = new HospitalManager();
		hm.launch();
		
		Patient michael = new Patient("Michael", 33, "Leg pain");
		patientListStart.addPatient(michael);
		Patient dave = new Patient("Dave", 31, "Back pain");
		patientListStart.addPatient(dave);
		Patient john = new Patient("John", 30, "Sore throat");
		patientListStart.addPatient(john);
		Patient simon = new Patient("Simon", 28, "Bad Head");
		patientListStart.addPatient(simon);
		Patient mark = new Patient("Mark", 31, "Sore foot");
		patientListStart.addPatient(mark);
		Patient lee = new Patient("Lee", 36, "Bad Neck");
		patientListStart.addPatient(lee);
		
		patientListStart.printList(patientListStart);

		System.out.println("--------------------");
		patientListStart.getListLength(patientListStart, hm);
		System.out.println(listLength);
		System.out.println("--------------------");

		patientListStart.deletePatient(patientListStart, hm);

		System.out.println("--------------------");
		patientListStart.printList(patientListStart);
		
		System.out.println("--------------------");
		patientListStart.getListLength(patientListStart, hm);
		System.out.println(listLength);
		System.out.println("--------------------");
		
	}
	
	
}