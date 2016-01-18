public class LibraryMock implements Library {
	
	public String getName() {
		return "Birkbeck Library";
	}
	
	public int getID() {
		return 1234;
	}
	
	public void setMaxBooksPerUser(int maxBooks) {
	}

	public int getMaxBooksPerUser() {
		return 2;
	}
}