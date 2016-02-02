import org.junit.*;
import static org.junit.Assert.*;

public class PrimeDivisorListTest {
	PrimeDivisorList primes;

	@Before
	public void buildUp() {
		primes = new PrimeDivisorListImpl();
	}
	@After
	public void cleanUp() {
	}

	@Test
	public void testsAdd() {
		primes.add(3);
		String output = primes.toString();
		String expected = "[ 3 ]";
		assertEquals(expected, output);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testsAddNonPrime() {
		primes.add(4);
	}

	@Test(expected = NullPointerException.class)
	public void testsAddNull() {
		primes.add(null);
	}

	@Test
	public void testsRemove() {
		primes.add(3);
		primes.add(5);
		primes.remove(0);
		String output = primes.toString();
		String expected = "[ 5 ]";
		assertEquals(expected, output);
	}

	@Test
	public void testsToString() {
		primes.add(7);
		primes.add(3);
		String output = primes.toString();
		String expected = "[ 3 * 7 = 21 ]";
		assertEquals(expected, output);
	}

	@Test
	public void testsToStringComplex() {
		primes.add(2);
		primes.add(3);
		primes.add(3);
		primes.add(7);
		String output = primes.toString();
		String expected = "[ 2 * 3^2 * 7 = 126 ]";
		assertEquals(expected, output);
	}

}