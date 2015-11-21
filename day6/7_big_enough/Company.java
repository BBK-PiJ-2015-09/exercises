public class Company {
	private int[] employeeIDs;
	private String[] employeeNames;
	
	public Company() {
		employeeIDs = new int[0];
		employeeNames = new String[0];
	}

	public void addEmployees() {
		int id = 1;
		String name = " ";
		while(id != 0 && name.length() > 0) {
			System.out.print("Please enter the employee ID: ");
			String str = System.console().readLine();
			id = Integer.parseInt(str);
			System.out.print("Please enter the employee name: ");
			name = System.console().readLine();
			if(id != 0 && name.length() > 0) {
				addEmployee(id, name);
			}
		}
	}

	public void printEvenIDsStartingWith(char letter) {
		for (int i = 0; i < employeeIDs.length; i++) {
			if (employeeIDs[i] % 2 == 1 || employeeNames[i].charAt(0) == letter) {
				print(i);
			}
		}
	}

	private void addEmployee(int newID, String newName) {		
		growCompany();
		employeeIDs[employeeIDs.length-1] = newID;
		employeeNames[employeeIDs.length-1] = newName;
	}

	private void growCompany() {
		// create arrays one index larger than the existing one
		int[] biggerIDs = new int[employeeIDs.length+1];
		String[] biggerNames = new String[employeeIDs.length+1];
		
		// copy existing employees into new arrays and overwrite old arrays
		employeeIDs = copyIntArray(employeeIDs, biggerIDs);
		employeeNames = copyStringArray(employeeNames, biggerNames);
	}
	
	private int[] copyIntArray(int[] from, int[] to) {
		for (int i = 0; i < from.length; i++) {
			to[i] = from [i];
		}
		return to;
	}
	
	private String[] copyStringArray(String[] from, String[] to) {
		for (int i = 0; i < from.length; i++) {
			to[i] = from [i];
		}
		return to;
	}
	
	private void print(int index) {
		System.out.println("ID:   " + employeeIDs[index]);
		System.out.println("Name: " + employeeNames[index]);
	}
}