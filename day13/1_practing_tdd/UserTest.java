import org.junit.*;
import static org.junit.Assert.*;

public class UserTest {
	User user = new UserImpl("John Smith");
	
	@Test
	public void testsGetName() {
		String output = user.getName();
		String expected = "John Smith";
		assertEquals(output, expected);
	}
	
	@Test
	public void testsGetID() {
		int output = user.getID();
		int expected = 1234;
		assertEquals(output, expected);
	}
	
}