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
		String expected = "[3]";
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

	}

	@Test
	public void testsToString() {

	}

}