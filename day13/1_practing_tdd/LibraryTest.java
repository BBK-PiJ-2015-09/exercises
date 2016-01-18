import org.junit.*;
import static org.junit.Assert.*;

public class LibraryTest {
	
	@Test
	public void testsGetName() {
		Library library = new LibraryImpl("British Library");
		String output = library.getName();
		String expected = "British Library";
		assertEquals(expected, output);
	}
	
	@Test
	public void testsMaxBooks() {
		Library library = new LibraryImpl("British Library");
		int input = 3;
		library.setMaxBooksPerUser(input);
		int output = library.getMaxBooksPerUser();
		int expected = input;
		assertEquals(expected, output);
	}

	@Test
	public void testsNegativeMaxBooks() {
		Library library = new LibraryImpl("British Library");
		int input = -3;
		library.setMaxBooksPerUser(input);
		int output = library.getMaxBooksPerUser();
		int expected = 0;
		assertEquals(expected, output);
	}

	@Test
	public void testsGetID() {
		Library library = new LibraryImpl("British Library");
		User user1 = new UserImpl("John Smith");
		user1.register(library);
		int output = library.getID(user1.getName());
		int expected = 1;
		assertEquals(expected, output);
		
		// once set, ID should remain the same
		output = library.getID(user1.getName());
		assertEquals(expected, output);
		
		// new user should get unique ID
		User user2 = new UserImpl("Janet Bobbins");
		user2.register(library);
		output = library.getID(user2.getName());
		expected = 2;
		assertEquals(expected, output);

		// once set, ID should remain the same
		output = library.getID(user1.getName());
		expected = 1;
		assertEquals(expected, output);

		// once set, ID should remain the same
		expected = 2;
		output = library.getID(user2.getName());
		assertEquals(expected, output);
	}
}
