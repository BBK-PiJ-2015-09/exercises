public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}

	public void addPatient(Patient newPatient) {
		if (this.nextPatient == null) {
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}

	public void printPatient() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(illness);
	}

	public void printList(Patient patient) {
		if (patient.nextPatient == null) {
			patient.printPatient();
		} else {
			patient.printPatient();
			printList(patient.nextPatient);
		}
	}
	
	public boolean deletePatient(Patient patient, HospitalManager hospitalManager) {
		if (this.equals(patient)) {
			System.out.println("Deleting patient: ");
			patient.printPatient();
			hospitalManager.setPatientListStart(patient.nextPatient);
			return true;
		} else if (this.nextPatient == null) {
			return false;
		} else if ( this.nextPatient.name.equals(patient.name)) {
			this.nextPatient = nextPatient.nextPatient;
			return true;
		} else {
			return this.nextPatient.deletePatient(patient, hospitalManager);
		}
	}

	public void getListLength(Patient patient, HospitalManager hm) {
		hm.resetListLength();
		listLength(patient, hm);
	}

	public void listLength(Patient patient, HospitalManager hm) {
		if (patient.nextPatient == null) {
			hm.incrementListLength();
		} else {
			hm.incrementListLength();
			listLength(patient.nextPatient, hm);
		}
	}

}