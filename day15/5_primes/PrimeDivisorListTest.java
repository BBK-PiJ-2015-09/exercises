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

}