import org.junit.*;
import static org.junit.Assert.*;

public class LibraryTest {
	private Library library;
	
	@Before
	public void buildUp() {
		library = new LibraryImpl("British Library");
	}
	
	@Test
	public void testsGetName() {
		String output = library.getName();
		String expected = "British Library";
		assertEquals(expected, output);
	}

	@Test
	public void testsMaxBooks() {
		int input = 3;
		library.setMaxBooksPerUser(input);
		int output = library.getMaxBooksPerUser();
		int expected = input;
		assertEquals(expected, output);
	}

	@Test
	public void testsNegativeMaxBooks() {
		int input = -3;
		library.setMaxBooksPerUser(input);
		int output = library.getMaxBooksPerUser();
		int expected = 0;
		assertEquals(expected, output);
	}

	@Test
	public void testsGetID() {
		User user1 = new UserImpl("John Smith");
		user1.register(library);
		int output = library.getID(user1.getName());
		int expected = 0;
		assertEquals(expected, output);

		// once set, ID should remain the same
		output = library.getID(user1.getName());
		assertEquals(expected, output);

		// new user should get unique ID
		User user2 = new UserImpl("Janet Bobbins");
		user2.register(library);
		output = library.getID(user2.getName());
		expected = 1;
		assertEquals(expected, output);

		// once set, ID should remain the same
		output = library.getID(user1.getName());
		expected = 0;
		assertEquals(expected, output);

		// once set, ID should remain the same
		expected = 1;
		output = library.getID(user2.getName());
		assertEquals(expected, output);
	}
	
	@Test
	public void testsGetLoadsOfIDs() {
		User user;
		for (int i = 0; i < 500; i++) {
			String name = "John Smith" + i;
			user = new UserImpl(name);
			user.register(library);
			user.getID();
		}
		int output = library.getID("John Smith499");
		int expected = 499;
		assertEquals(expected, output);
	}
}
