public class MyMainMethod {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(1,2));
		System.out.println(calculator.subtract(1,2));
		System.out.println(calculator.multiply(1,2));
		System.out.println(calculator.divide(1,2));
		System.out.println(calculator.modulus(11,2));
		String str = System.console().readLine();
		int n = Integer.parseInt(str);
		System.out.println("The square of " + str + " is " + calculator.multiply(n,n));
		System.out.println(str + " x 10 = " + calculator.multiply(n,10));
	}

}