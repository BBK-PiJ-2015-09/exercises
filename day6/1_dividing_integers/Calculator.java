public class Calculator {

	public double add(int x, int y) {
		double x_double = (double) x;
		double y_double = (double) x;
		return x_double + y_double;
	}	

	public double subtract(int x, int y) {
		double x_double = (double) x;
		double y_double = (double) y;
		return x_double - y_double;
	}

	public double divide(int x, int y) {
		double x_double = (double) x;
		double y_double = (double) y;
		return x_double / y_double;
	}
	
	public double multiply(int x, int y) {
		double x_double = (double) x;
		double y_double = (double) y;
		return x_double * y_double;
	}

	public double modulus(int x, int y) {
		double x_double = (double) x;
		double y_double = (double) y;
		return x_double % y_double;
	}

}
