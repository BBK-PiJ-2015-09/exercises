public class UserImpl implements User {
	private String name;
	private Library library;
	private int id;
	
	public UserImpl(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getID() {
		return id;
	}
	
	@Override
	public void register(Library library) {
		this.library = library;
		this.id = library.getID();
	}
	
	@Override
	public String getLibrary() {
		return library.getName();
	}
	
}