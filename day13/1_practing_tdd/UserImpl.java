public class UserImpl implements User {
	private String name;
	private Library library;
	
	/**
	 * Constructor
	 *
	 * @param the User's name
	 */
	public UserImpl(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getID() {
		return library.getID(name);
	}
	
	@Override
	public void register(Library library) {
		this.library = library;
	}
	
	@Override
	public String getLibrary() {
		return library.getName();
	}
	
}