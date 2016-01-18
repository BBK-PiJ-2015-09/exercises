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
		User user = new UserMock();
		int output = user.getID();
		int expected = 1234;
		assertEquals(output, expected);
	}
	
}