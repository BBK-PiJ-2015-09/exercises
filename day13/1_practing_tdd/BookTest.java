import org.junit.*;
import static org.junit.Assert.*;

public class BookTest {
	Book book;
	
	@Before
	public void buildUp() {
		book = new BookImpl("Jonathan Swift", "Gulliver's Travels");
	}
	@After
	public void cleanUp() {
	}	
		
	@Test
	public void testsGetAuthor() {
		String output = book.getAuthor();
		String expected = "Jonathan Swift";
		assertEquals(output, expected);
	}
	
	@Test
	public void testsGetTitle() {
		String output = book.getTitle();
		String expected = "Gulliver's Travels";
		assertEquals(output, expected);
	}

}