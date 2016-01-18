import org.junit.*;
import static org.junit.Assert.*;

public class LibraryTest {
	
	@Test
	public void testsGetName() {
		Library library = new LibraryImpl("British Library");
		String output = library.getName();
		String expected = "British Library";
		assertEquals(output, expected);
	}
	
	@Test
	public void testsMaxBooks() {
		Library library = new LibraryImpl("British Library");
		int input = 3;
		library.setMaxBooksPerUser(input);
		int output = library.getMaxBooksPerUser();
		int expected = input;
		assertEquals(output, expected);
	}

	@Test
	public void testsNegativeMaxBooks() {
		Library library = new LibraryImpl("British Library");
		int input = -3;
		library.setMaxBooksPerUser(input);
		int output = library.getMaxBooksPerUser();
		int expected = 0;
		assertEquals(output, expected);
	}

}