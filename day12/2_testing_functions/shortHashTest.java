import org.junit.*;
import static org.junit.Assert.*;

public class shortHashTest {
	@Test
	public void testsZero() {
		int input = 0;
		int output = HashUtilities.shortHash(input);
		int expected = 0;
		assertEquals(output, expected);
	}

	@Test
	public void tests999() {
		int input = 999;
		int output = HashUtilities.shortHash(input);
		int expected = 999;
		assertEquals(output, expected);
	}

	@Test
	public void tests1000() {
		int input = 1000;
		int output = HashUtilities.shortHash(input);
		int expected = 0;
		assertEquals(output, expected);
	}

	@Test
	public void tests1001() {
		int input = 1001;
		int output = HashUtilities.shortHash(input);
		int expected = 1;
		assertEquals(output, expected);
	}

	@Test
	public void testsNegative() {
		int input = -1;
		int output = HashUtilities.shortHash(input);
		int expected = 1;
		assertEquals(output, expected);
	}

	@Test
	public void testsNegative1000() {
		int input = -1000;
		int output = HashUtilities.shortHash(input);
		int expected = 0;
		assertEquals(output, expected);
	}

	@Test
	public void testsNegative1001() {
		int input = -1001;
		int output = HashUtilities.shortHash(input);
		int expected = 1;
		assertEquals(output, expected);
	}

	@Test
	public void testsOneBillionAndTwo() {
		int input = 1_000_000_002;
		int output = HashUtilities.shortHash(input);
		int expected = 2;
		assertEquals(output, expected);
	}

}
