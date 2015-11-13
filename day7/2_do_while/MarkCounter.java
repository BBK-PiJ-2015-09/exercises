public class MarkCounter {

	private int distinction = 0;
	private int pass = 0;
	private int fail = 0;
	private int invalid = 0;
	
	public void printAll() {
		System.out.println("Distinction: " + distinction);
		System.out.println("Pass: " + pass);
		System.out.println("Fail: " + fail);
		System.out.println("Invalid: " + invalid);
	}
	
	public void getInput() {
		String markInput;
	
		do {
		
			System.out.print("Input a mark: ");
			markInput = System.console().readLine();
			int markInt = Integer.parseInt(markInput);
			if (markInt == -1 ) {

			} else if ( markInt > 100 || markInt < 0) {
				invalid++;
			} else if (markInt >= 70) {
				distinction++;
			} else if(markInt >= 50) {
				pass++;
			} else if(markInt >= 0) {
				fail++;
			}
		
		} while (!markInput.equals("-1"));
	
	}

}