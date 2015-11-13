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
	
	public void appendPatient(Patient newPatient, Patient firstPatient) {
		if (getNextPatient() == firstPatient) {
			setNextPatient(newPatient);
			newPatient.setLastPatient(this);
			newPatient.setNextPatient(firstPatient);
			firstPatient.setLastPatient(newPatient);
		} else {
			nextPatient.appendPatient(newPatient, firstPatient);
		}
	}

	public String getName() {
		return name;
	}

	public void setNextPatient(Patient patient) {
		nextPatient = patient;
	}

	public void setLastPatient(Patient patient) {
		lastPatient = patient;
	}

	public Patient getNextPatient() {
		if ( nextPatient == null ) {
			return this;
		} else {
			return nextPatient;
		}
	}

	public Patient getLastPatient() {
		if ( lastPatient == null ) {
			return this;
		} else {
			return lastPatient;
		}
	}

	public void printPatient() {
		System.out.print("Name: ");
		System.out.println(name);
		System.out.print("Age: ");
		System.out.println(age);
		System.out.print("Illness: ");
		System.out.println(illness);
		System.out.println(".....");
	}

	public void printList(Patient firstPatient) {
		if (getNextPatient() == firstPatient) {
			printPatient();
		} else {
			printPatient();
			getNextPatient().printList(firstPatient);
		}
	}
	
	public void printListBackwards(Patient lastPatient) {
		if (getLastPatient() == lastPatient) {
			printPatient();
		} else {
			printPatient();
			getLastPatient().printListBackwards(lastPatient);
		}
	}

	private void destroy() {
		System.out.println("Deleting patient: ");
		this.printPatient();
		getLastPatient().setNextPatient(getNextPatient());
		getNextPatient().setLastPatient(getLastPatient());
		setLastPatient(null);
		setNextPatient(null);
	}

	public void deletePatient(Patient patient, Patient firstPatient) {
		if ( this.equals(patient) ) {
			this.destroy();
		} else if ( getNextPatient() == firstPatient ) {
			System.out.println("No patient found with details:");
			patient.printPatient();
		} else {
			this.getNextPatient().deletePatient(patient, firstPatient);
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