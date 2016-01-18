public class LibraryImpl implements Library {
	private String name;
	private int maxBooks;
	
	/**
	 * Constructor
	 *
	 * @param the Library's name
	 */
	public LibraryImpl(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getID() {
		return 0;
	}

	@Override
	public void setMaxBooksPerUser(int maxBooks) {
		if (maxBooks < 0) {
			this.maxBooks = 0;
		} else {
			this.maxBooks = maxBooks;
		}
	}
	
	@Override
	public int getMaxBooksPerUser() {
		return maxBooks;
	}
	
}