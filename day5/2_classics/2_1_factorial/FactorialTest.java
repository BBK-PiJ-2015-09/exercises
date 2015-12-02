public class FactorialTest {
	
	public static void main (String[] args) {
		Factorial calc = new Factorial();
		System.out.println(calc.recursiveFactorial(10));
		System.out.println(calc.iterativeFactorial(10));
	}

}