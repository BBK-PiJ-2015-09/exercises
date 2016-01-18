import org.junit.*;
import static org.junit.Assert.*;

public class UserTest {
	
	@Test
	public void testsGetName() {
		User user = new UserImpl("John Smith");
		String output = user.getName();
		String expected = "John Smith";
		assertEquals(output, expected);
	}
	
	@Test
	public void testsGetID() {
		User user = new UserImpl("John Smith");
		Library library = new LibraryMock();
		user.register(library);
		int output = user.getID();
		int expected = 1234;
		assertEquals(output, expected);
	}
	
	@Test
	public void testsGetLibrary() {
		User user = new UserImpl("John Smith");
		Library library = new LibraryMock();
		user.register(library);
		String output = user.getLibrary();
		String expected = "Birkbeck Library";
		assertEquals(output, expected);
	}
}