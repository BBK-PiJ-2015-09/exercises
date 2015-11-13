public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient lastPatient;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.lastPatient = null;
	}

	public void addPatient(Patient newPatient) {
		if (this.nextPatient == null) {
			this.nextPatient = newPatient;
			newPatient.setLastPatient(this);
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public void setNextPatient(Patient patient) {
		nextPatient = patient;
	}

	public void setLastPatient(Patient patient) {
		lastPatient = patient;
	}

	public Patient getLastPatient() {
		return this.lastPatient;
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
	
	public void printListBackwards(Patient patient) {
		if (patient.lastPatient == null) {
			patient.printPatient();
		} else {
			patient.printPatient();
			printListBackwards(patient.lastPatient);
		}
	}

	private void destroy() {
		System.out.println("Deleting patient: ");
		this.printPatient();
		if ( lastPatient != null ) {
			lastPatient.setNextPatient(nextPatient);
			lastPatient = null;
		}
		if ( nextPatient != null ) {
			nextPatient.setLastPatient(lastPatient);
			nextPatient = null;
		}
	}

	public void deletePatient(Patient patient, HospitalManager hm) {
		if ( this.equals(patient) ) {
			this.destroy();
		} else {
			if ( this.nextPatient != null ) {
				this.nextPatient.deletePatient(patient, hm);
			} else {
				System.out.println("No patient found with details:");
				patient.printPatient();
			}
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